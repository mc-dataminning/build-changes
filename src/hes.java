import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hes implements hev<kr> {
   private final ger a;

   public hes(ger $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cxh $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cxf $$1, fgr $$2, gmx $$3, int $$4, int $$5, boolean $$6) {
      duj $$7 = $$0 != null ? $$0.a(kv.ak, duj.a) : duj.a;
      cwe $$8 = $$0 != null ? $$0.a(kv.al) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hhy $$10 = $$9 ? hib.g : hib.h;
      fgv $$11 = $$10.c().a(gub.a($$3, this.a.a($$10.a()), $$1 == cxf.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gpe.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cwe.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hev.a {
      public static final hes.a a = new hes.a();
      public static final MapCodec<hes.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hes.a> a() {
         return b;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new hes(new ger($$0.a(ggb.cF)));
      }
   }
}
