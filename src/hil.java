import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hil implements hio<kh> {
   private final gic a;

   public hil(gic $$0) {
      this.a = $$0;
   }

   @Nullable
   public kh a(czk $$0) {
      return $$0.e();
   }

   public void a(@Nullable kh $$0, czi $$1, fjy $$2, gqm $$3, int $$4, int $$5, boolean $$6) {
      dxc $$7 = $$0 != null ? $$0.a(kk.am, dxc.a) : dxc.a;
      cyi $$8 = $$0 != null ? $$0.a(kk.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hlq $$10 = $$9 ? hlt.g : hlt.h;
      fkc $$11 = $$10.c().a(gxr.a($$3, this.a.a($$10.a()), $$1 == czi.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gst.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cyi.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hio.a {
      public static final hil.a a = new hil.a();
      public static final MapCodec<hil.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hil.a> a() {
         return b;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hil(new gic($$0.a(gjn.cR)));
      }
   }
}
