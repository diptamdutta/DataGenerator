package org.finra.scaffolding.knowledge

import java.util.UUID

import org.finra.scaffolding.knowledge.context.KnowledgeContextAware

/**
  * Created by dkopel on 19/05/16.
  */
trait Knowledge[T] extends KnowledgeContextAware {
    val id: UUID
    val name: String
    val knowledgePackage: KnowledgePackage
}