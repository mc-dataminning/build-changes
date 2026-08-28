import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcg extends gcf implements abm, ww {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private crf o;
   private final ke.b p;
   private final gcv q = new gcv();
   @Nullable
   private gco r;
   @Nullable
   protected fli.b l;

   public gcg(fji $$0, wc $$1, gcm $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.p = $$2.c();
      this.o = $$2.d();
      this.l = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aas $$0) {
      this.b($$0);
   }

   private void b(aas $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abo $$0) {
      zs.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aag $$0) {
      zs.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abr $$0) {
      this.o = crh.f.a($$0.b());
   }

   @Override
   public void a(abq $$0) {
      zs.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new gco();
      }

      List<auh> $$1 = this.r.a($$0.b());
      this.b(new abw($$1));
   }

   @Override
   public void a(abp $$0) {
      this.l = null;
   }

   private <T> T a(Function<ave, T> $$0) {
      if (this.r == null) {
         return $$0.apply(ave.b);
      } else {
         Object var3;
         try (auq $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abn $$0) {
      zs.a($$0, this, this.a);
      ke.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(agu.b.a(wt.a($$1)), new gcj(this.a, this.b, new gcm(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k)));
      this.b.a(abv.a);
      this.b.a(agu.a.a(wt.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(we $$0) {
      super.a($$0);
      this.a.z();
   }
}
