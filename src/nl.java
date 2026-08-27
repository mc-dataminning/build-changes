import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nl {
   public static final aet<dwm> a = nw.a("bastion/starts");

   public static void a(np<dwm> $$0) {
      hh<dyu> $$1 = $$0.a(je.aA);
      hg<dyu> $$2 = $$1.b(nx.w);
      hh<dwm> $$3 = $$0.a(je.aC);
      hg<dwm> $$4 = $$3.b(nw.a);
      $$0.a(
         a,
         new dwm(
            $$4,
            ImmutableList.of(
               Pair.of(dwk.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwk.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwk.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwk.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwm.a.b
         )
      );
      nk.a($$0);
      nj.a($$0);
      nn.a($$0);
      ni.a($$0);
      nm.a($$0);
   }
}
