import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdu implements hdx<kr> {
   private final gdt a;

   public hdu(gdt $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cwq $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cwo $$1, ffv $$2, glz $$3, int $$4, int $$5, boolean $$6) {
      dtr $$7 = $$0 != null ? $$0.a(kv.ai, dtr.a) : dtr.a;
      cvn $$8 = $$0 != null ? $$0.a(kv.aj) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hha $$10 = $$9 ? hhd.g : hhd.h;
      ffz $$11 = $$10.c().a(gtd.a($$3, this.a.a($$10.a()), $$1 == cwo.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gog.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cvn.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hdx.a {
      public static final hdu.a a = new hdu.a();
      public static final MapCodec<hdu.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hdu.a> a() {
         return b;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdu(new gdt($$0.a(gfd.cD)));
      }
   }
}
