import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pd {
   public static final aix<ecu> a = po.a("bastion/starts");

   public static void a(ph<ecu> $$0) {
      ik<efj> $$1 = $$0.a(kg.aE);
      ij<efj> $$2 = $$1.b(pp.w);
      ik<ecu> $$3 = $$0.a(kg.aG);
      ij<ecu> $$4 = $$3.b(po.a);
      $$0.a(
         a,
         new ecu(
            $$4,
            ImmutableList.of(
               Pair.of(ecs.b("bastion/units/air_base", $$2), 1),
               Pair.of(ecs.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ecs.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ecs.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ecu.a.b
         )
      );
      pc.a($$0);
      pb.a($$0);
      pf.a($$0);
      pa.a($$0);
      pe.a($$0);
   }
}
