import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nn {
   public static final aey<dwl> a = ny.a("bastion/starts");

   public static void a(nr<dwl> $$0) {
      hf<dyt> $$1 = $$0.a(jc.aB);
      he<dyt> $$2 = $$1.b(nz.w);
      hf<dwl> $$3 = $$0.a(jc.aD);
      he<dwl> $$4 = $$3.b(ny.a);
      $$0.a(
         a,
         new dwl(
            $$4,
            ImmutableList.of(
               Pair.of(dwj.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwj.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwj.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwj.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwl.a.b
         )
      );
      nm.a($$0);
      nl.a($$0);
      np.a($$0);
      nk.a($$0);
      no.a($$0);
   }
}
