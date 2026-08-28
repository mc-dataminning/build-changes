import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhy implements hib<kg> {
   private final ghq a;

   public hhy(ghq $$0) {
      this.a = $$0;
   }

   @Nullable
   public kg a(czd $$0) {
      return $$0.e();
   }

   public void a(@Nullable kg $$0, czb $$1, fjj $$2, gqa $$3, int $$4, int $$5, boolean $$6) {
      dwv $$7 = $$0 != null ? $$0.a(kj.am, dwv.a) : dwv.a;
      cyb $$8 = $$0 != null ? $$0.a(kj.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hle $$10 = $$9 ? hlh.g : hlh.h;
      fjn $$11 = $$10.c().a(gxf.a($$3, this.a.a($$10.a()), $$1 == czb.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gsh.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cyb.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hib.a {
      public static final hhy.a a = new hhy.a();
      public static final MapCodec<hhy.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hhy.a> a() {
         return b;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhy(new ghq($$0.a(gjb.cR)));
      }
   }
}
