package org.finra.scaffolding.random

import org.finra.scaffolding.random.predicate.{RandomContext, RandomGenerator}

/**
  * Created by dkopel on 1/10/17.
  */
class BarStringRandomizer extends RandomGenerator[String] {
    override def apply(v1: RandomContext): String = "this is bar"
}