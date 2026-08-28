import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hkb implements hke<kh> {
   private final gjs a;

   public hkb(gjs $$0) {
      this.a = $$0;
   }

   @Nullable
   public kh a(czy $$0) {
      return $$0.e();
   }

   public void a(@Nullable kh $$0, czw $$1, flo $$2, gsa $$3, int $$4, int $$5, boolean $$6) {
      dxs $$7 = $$0 != null ? $$0.a(kk.am, dxs.a) : dxs.a;
      cyw $$8 = $$0 != null ? $$0.a(kk.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hnh $$10 = $$9 ? hnk.g : hnk.h;
      flr $$11 = $$10.c().a(gzg.a($$3, this.a.a($$10.a()), $$1 == czw.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gui.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cyw.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hke.a {
      public static final hkb.a a = new hkb.a();
      public static final MapCodec<hkb.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hkb.a> a() {
         return b;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hkb(new gjs($$0.a(gld.cT)));
      }
   }
}
