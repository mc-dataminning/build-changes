import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(qy<enh> $$0) {
      jr<enh> $$1 = $$0.a(lz.aV);
      jq<enh> $$2 = $$1.b(rf.a);
      rf.a(
         $$0,
         "bastion/mobs/piglin",
         new enh(
            $$2,
            ImmutableList.of(
               Pair.of(enf.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(enf.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(enf.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(enf.b("bastion/mobs/empty"), 1)
            ),
            enh.a.b
         )
      );
      rf.a(
         $$0, "bastion/mobs/hoglin", new enh($$2, ImmutableList.of(Pair.of(enf.b("bastion/mobs/hoglin"), 2), Pair.of(enf.b("bastion/mobs/empty"), 1)), enh.a.b)
      );
      rf.a(
         $$0, "bastion/blocks/gold", new enh($$2, ImmutableList.of(Pair.of(enf.b("bastion/blocks/air"), 3), Pair.of(enf.b("bastion/blocks/gold"), 1)), enh.a.b)
      );
      rf.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new enh(
            $$2,
            ImmutableList.of(
               Pair.of(enf.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(enf.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(enf.b("bastion/mobs/sword_piglin"), 1)
            ),
            enh.a.b
         )
      );
   }
}
