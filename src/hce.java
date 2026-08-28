import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hce implements hck {
   private final hhr a;
   private final List<fnq> b;

   hce(hhr $$0, List<fnq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      hcn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hcn.a.c : hcn.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gnh $$11 = gmq.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cxh $$0) {
      return $$0.a(awy.bt) || $$0.a(cxl.rV);
   }

   public static record a(aku b, List<fnq> c) implements hck.b {
      public static final MapCodec<hce.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("model").forGetter(hce.a::b), fnr.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hce.a::c))
               .apply($$0, hce.a::new)
      );

      @Override
      public void a(hij.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hck a(hck.a $$0) {
         hhr $$1 = $$0.a(this.b);
         return new hce($$1, this.c);
      }

      @Override
      public MapCodec<hce.a> a() {
         return a;
      }
   }
}
