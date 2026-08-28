import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hha implements hhd<kg> {
   private final ggv a;

   public hha(ggv $$0) {
      this.a = $$0;
   }

   @Nullable
   public kg a(cys $$0) {
      return $$0.e();
   }

   public void a(@Nullable kg $$0, cyq $$1, fiq $$2, gpd $$3, int $$4, int $$5, boolean $$6) {
      dwd $$7 = $$0 != null ? $$0.a(kj.am, dwd.a) : dwd.a;
      cxq $$8 = $$0 != null ? $$0.a(kj.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hkg $$10 = $$9 ? hkj.g : hkj.h;
      fiu $$11 = $$10.c().a(gwi.a($$3, this.a.a($$10.a()), $$1 == cyq.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         grk.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cxq.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hhd.a {
      public static final hha.a a = new hha.a();
      public static final MapCodec<hha.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hha.a> a() {
         return b;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hha(new ggv($$0.a(gif.cN)));
      }
   }
}
