import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjb extends gja implements aba, wk {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cub n;
   private final js.b o;
   private final gjr p = new gjr();
   @Nullable
   private gjk q;
   @Nullable
   protected frr.b k;

   public gjb(fof $$0, vp $$1, gji $$2) {
      super($$0, $$1, $$2);
      this.m = $$2.a();
      this.o = $$2.c();
      this.n = $$2.d();
      this.k = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aag $$0) {
      this.b($$0);
   }

   private void b(aag $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abc $$0) {
      zg.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zu $$0) {
      zg.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abf $$0) {
      this.n = cud.e.a($$0.b());
   }

   @Override
   public void a(abe $$0) {
      zg.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gjk();
      }

      List<auh> $$1 = this.q.a($$0.b());
      this.b(new abk($$1));
   }

   @Override
   public void a(abd $$0) {
      this.k = null;
   }

   private <T> T a(Function<ave, T> $$0) {
      if (this.q == null) {
         return $$0.apply(ave.b);
      } else {
         Object var3;
         try (auq $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abb $$0) {
      zg.a($$0, this, this.a);
      js.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agm.b.a(wh.a($$1)), new gje(this.a, this.b, new gji(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abj.a);
      this.b.a(agm.a.a(wh.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vr $$0) {
      super.a($$0);
      this.a.z();
   }
}
