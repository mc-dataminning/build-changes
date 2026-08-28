import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qr {
   public static void a(qu<emq> $$0) {
      jp<emq> $$1 = $$0.a(lw.aW);
      jo<emq> $$2 = $$1.b(rb.a);
      rb.a(
         $$0,
         "bastion/mobs/piglin",
         new emq(
            $$2,
            ImmutableList.of(
               Pair.of(emo.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(emo.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(emo.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(emo.b("bastion/mobs/empty"), 1)
            ),
            emq.a.b
         )
      );
      rb.a(
         $$0, "bastion/mobs/hoglin", new emq($$2, ImmutableList.of(Pair.of(emo.b("bastion/mobs/hoglin"), 2), Pair.of(emo.b("bastion/mobs/empty"), 1)), emq.a.b)
      );
      rb.a(
         $$0, "bastion/blocks/gold", new emq($$2, ImmutableList.of(Pair.of(emo.b("bastion/blocks/air"), 3), Pair.of(emo.b("bastion/blocks/gold"), 1)), emq.a.b)
      );
      rb.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new emq(
            $$2,
            ImmutableList.of(
               Pair.of(emo.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(emo.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(emo.b("bastion/mobs/sword_piglin"), 1)
            ),
            emq.a.b
         )
      );
   }
}
