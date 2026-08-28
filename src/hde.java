import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hde implements hdk {
   private final his a;
   private final List<fon> b;

   hde(his $$0, List<fon> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      hdn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hdn.a.c : hdn.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      goi $$11 = gnr.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cxy $$0) {
      return $$0.a(axi.bt) || $$0.a(cyc.rX);
   }

   public static record a(ald b, List<fon> c) implements hdk.b {
      public static final MapCodec<hde.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ald.a.fieldOf("model").forGetter(hde.a::b), foo.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hde.a::c))
               .apply($$0, hde.a::new)
      );

      @Override
      public void a(hjk.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hdk a(hdk.a $$0) {
         his $$1 = $$0.a(this.b);
         return new hde($$1, this.c);
      }

      @Override
      public MapCodec<hde.a> a() {
         return a;
      }
   }
}
