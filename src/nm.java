import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nm {
   public static void a(np<dwm> $$0) {
      hh<dwm> $$1 = $$0.a(je.aC);
      hg<dwm> $$2 = $$1.b(nw.a);
      nw.a(
         $$0,
         "bastion/mobs/piglin",
         new dwm(
            $$2,
            ImmutableList.of(
               Pair.of(dwk.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwk.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwk.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwk.b("bastion/mobs/empty"), 1)
            ),
            dwm.a.b
         )
      );
      nw.a(
         $$0, "bastion/mobs/hoglin", new dwm($$2, ImmutableList.of(Pair.of(dwk.b("bastion/mobs/hoglin"), 2), Pair.of(dwk.b("bastion/mobs/empty"), 1)), dwm.a.b)
      );
      nw.a(
         $$0, "bastion/blocks/gold", new dwm($$2, ImmutableList.of(Pair.of(dwk.b("bastion/blocks/air"), 3), Pair.of(dwk.b("bastion/blocks/gold"), 1)), dwm.a.b)
      );
      nw.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwm(
            $$2,
            ImmutableList.of(
               Pair.of(dwk.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwk.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwk.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwm.a.b
         )
      );
   }
}
