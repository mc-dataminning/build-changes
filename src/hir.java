import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hir implements hiu<kh> {
   private final gih a;

   public hir(gih $$0) {
      this.a = $$0;
   }

   @Nullable
   public kh a(czn $$0) {
      return $$0.e();
   }

   public void a(@Nullable kh $$0, czl $$1, fkd $$2, gqr $$3, int $$4, int $$5, boolean $$6) {
      dxh $$7 = $$0 != null ? $$0.a(kk.am, dxh.a) : dxh.a;
      cyl $$8 = $$0 != null ? $$0.a(kk.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hlx $$10 = $$9 ? hma.g : hma.h;
      fkh $$11 = $$10.c().a(gxw.a($$3, this.a.a($$10.a()), $$1 == czl.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gsy.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cyl.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hiu.a {
      public static final hir.a a = new hir.a();
      public static final MapCodec<hir.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hir.a> a() {
         return b;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hir(new gih($$0.a(gjs.cT)));
      }
   }
}
