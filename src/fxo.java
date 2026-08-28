import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxo extends fxn implements abm, wz {
   private static final Logger j = LogUtils.getLogger();
   private final GameProfile k;
   private cpg l;
   private final jw.b m;
   private final fyd n = new fyd();
   @Nullable
   private fxw o;
   @Nullable
   protected fha.b i;

   public fxo(ffa $$0, wj $$1, fxu $$2) {
      super($$0, $$1, $$2);
      this.k = $$2.a();
      this.m = $$2.c();
      this.l = $$2.d();
      this.i = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aat $$0) {
      this.b($$0);
   }

   private void b(aat $$0) {
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abo $$0) {
      zv.a($$0, this, this.a);
      this.n.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aah $$0) {
      zv.a($$0, this, this.a);
      this.n.a($$0.b());
   }

   @Override
   public void a(abr $$0) {
      this.l = cpi.e.a($$0.b());
   }

   @Override
   public void a(abq $$0) {
      zv.a($$0, this, this.a);
      if (this.o == null) {
         this.o = new fxw();
      }

      List<ats> $$1 = this.o.a($$0.b());
      this.b(new abw($$1));
   }

   @Override
   public void a(abp $$0) {
      this.i = null;
   }

   private <T> T a(Function<auo, T> $$0) {
      if (this.o == null) {
         return $$0.apply(auo.b);
      } else {
         Object var3;
         try (aub $$1 = this.o.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abn $$0) {
      zv.a($$0, this, this.a);
      jw.b $$1 = this.a($$0x -> this.n.a($$0x, this.m, this.b.e()));
      this.b.a(agr.b.bind(ww.a($$1)), new fxr(this.a, this.b, new fxu(this.k, this.e, $$1, this.l, this.d, this.c, this.f, this.h, this.i)));
      this.b.a(abv.a);
      this.b.a(agr.a.bind(ww.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(xl $$0) {
      super.a($$0);
      this.a.B();
   }
}
