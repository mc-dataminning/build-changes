import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hez implements hff {
   private final hkp a;
   private final List<fqc> b;

   hez(hkp $$0, List<fqc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      hfi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hfi.a.c : hfi.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gqc $$11 = gpk.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cyy $$0) {
      return $$0.a(axk.bt) || $$0.a(czc.rZ);
   }

   public static record a(alg b, List<fqc> c) implements hff.b {
      public static final MapCodec<hez.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(hez.a::b), fqd.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hez.a::c))
               .apply($$0, hez.a::new)
      );

      @Override
      public void a(hlh.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hff a(hff.a $$0) {
         hkp $$1 = $$0.a(this.b);
         return new hez($$1, this.c);
      }

      @Override
      public MapCodec<hez.a> a() {
         return a;
      }
   }
}
