import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbe implements hbk {
   private final hgr a;
   private final List<fms> b;

   hbe(hgr $$0, List<fms> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      hbn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hbn.a.c : hbn.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gmh $$11 = glq.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cwo $$0) {
      return $$0.a(awy.bt) || $$0.a(cws.rT);
   }

   public static record a(akv b, List<fms> c) implements hbk.b {
      public static final MapCodec<hbe.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("model").forGetter(hbe.a::b), fmt.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hbe.a::c))
               .apply($$0, hbe.a::new)
      );

      @Override
      public void a(hhj.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbk a(hbk.a $$0) {
         hgr $$1 = $$0.a(this.b);
         return new hbe($$1, this.c);
      }

      @Override
      public MapCodec<hbe.a> a() {
         return a;
      }
   }
}
