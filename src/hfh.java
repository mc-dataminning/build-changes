import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hfh implements hfn {
   private final hkx a;
   private final List<fqj> b;

   hfh(hkx $$0, List<fqj> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      hfq.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hfq.a.c : hfq.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gqk $$11 = gps.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(czd $$0) {
      return $$0.a(axk.bu) || $$0.a(czh.se);
   }

   public static record a(alg b, List<fqj> c) implements hfn.b {
      public static final MapCodec<hfh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(hfh.a::b), fqk.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hfh.a::c))
               .apply($$0, hfh.a::new)
      );

      @Override
      public void a(hlp.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hfn a(hfn.a $$0) {
         hkx $$1 = $$0.a(this.b);
         return new hfh($$1, this.c);
      }

      @Override
      public MapCodec<hfh.a> a() {
         return a;
      }
   }
}
