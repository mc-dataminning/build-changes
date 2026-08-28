import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyx extends fyw implements abb, wm {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private cpj o;
   private final ka.b p;
   private final fzm q = new fzm();
   @Nullable
   private fzf r;
   @Nullable
   protected fih.b l;

   public fyx(fgi $$0, vs $$1, fzd $$2) {
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
   protected void a(aai $$0) {
      this.b($$0);
   }

   private void b(aai $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abd $$0) {
      zi.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zw $$0) {
      zi.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abg $$0) {
      this.o = cpl.d.a($$0.b());
   }

   @Override
   public void a(abf $$0) {
      zi.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new fzf();
      }

      List<atk> $$1 = this.r.a($$0.b());
      this.b(new abl($$1));
   }

   @Override
   public void a(abe $$0) {
      this.l = null;
   }

   private <T> T a(Function<aug, T> $$0) {
      if (this.r == null) {
         return $$0.apply(aug.b);
      } else {
         Object var3;
         try (att $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abc $$0) {
      zi.a($$0, this, this.a);
      ka.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(
            agg.b.bind(wj.a($$1)),
            new fza(this.a, this.b, new fzd(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k))
         );
      this.b.a(abk.a);
      this.b.a(agg.a.bind(wj.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vu $$0) {
      super.a($$0);
      this.a.z();
   }
}
