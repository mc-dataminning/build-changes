import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhq implements hht<kg> {
   private final ghi a;

   public hhq(ghi $$0) {
      this.a = $$0;
   }

   @Nullable
   public kg a(cyy $$0) {
      return $$0.e();
   }

   public void a(@Nullable kg $$0, cyw $$1, fjc $$2, gps $$3, int $$4, int $$5, boolean $$6) {
      dwn $$7 = $$0 != null ? $$0.a(kj.am, dwn.a) : dwn.a;
      cxw $$8 = $$0 != null ? $$0.a(kj.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hkw $$10 = $$9 ? hkz.g : hkz.h;
      fjg $$11 = $$10.c().a(gwx.a($$3, this.a.a($$10.a()), $$1 == cyw.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         grz.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cxw.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hht.a {
      public static final hhq.a a = new hhq.a();
      public static final MapCodec<hhq.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hhq.a> a() {
         return b;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhq(new ghi($$0.a(git.cP)));
      }
   }
}
