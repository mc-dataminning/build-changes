import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzl extends fzk implements abf, ws {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cop k;
   private final jo.b l;
   private final gaa m = new gaa();
   @Nullable
   private fzt n;

   public fzl(fgj $$0, wc $$1, fzr $$2) {
      super($$0, $$1, $$2);
      this.j = $$2.a();
      this.l = $$2.c();
      this.k = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aam $$0) {
      this.b($$0);
   }

   private void b(aam $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abh $$0) {
      zo.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aaa $$0) {
      zo.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(abj $$0) {
      this.k = cor.e.a($$0.b());
   }

   @Override
   public void a(abi $$0) {
      zo.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fzt();
      }

      List<atk> $$1 = this.n.a($$0.b());
      this.b(new abo($$1));
   }

   private <T> T a(Function<aug, T> $$0) {
      if (this.n == null) {
         return $$0.apply(aug.b);
      } else {
         Object var3;
         try (att $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abg $$0) {
      zo.a($$0, this, this.a);
      jo.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(agk.b.bind(wp.a($$1)), new fzo(this.a, this.b, new fzr(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(abn.a);
      this.b.a(agk.a.bind(wp.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(xe $$0) {
      super.a($$0);
      this.a.B();
   }
}
