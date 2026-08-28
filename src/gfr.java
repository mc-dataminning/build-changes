import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfr {
   private final GameProfile a;
   private final Supplier<hch> b;
   private dgw c = dgw.e;
   private int d;
   @Nullable
   private xk e;
   private boolean f = true;
   @Nullable
   private yb g;
   private yg h;
   private int i;

   public gfr(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hch>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hch> a(GameProfile $$0) {
      flz $$1 = flz.Q();
      hci $$2 = $$1.an();
      CompletableFuture<hch> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hch $$5 = hby.a($$0);
      return () -> {
         hch $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yb b() {
      return this.g;
   }

   public yg c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(yb $$0) {
      this.g = $$0;
      this.h = $$0.a(cpr.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static yg c(boolean $$0) {
      return $$0 ? yg.c : yg.b;
   }

   public dgw e() {
      return this.c;
   }

   protected void a(dgw $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hch g() {
      return this.b.get();
   }

   @Nullable
   public fcr h() {
      return flz.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable xk $$0) {
      this.e = $$0;
   }

   @Nullable
   public xk i() {
      return this.e;
   }

   public void b(boolean $$0) {
      this.f = $$0;
   }

   public boolean j() {
      return this.f;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public int k() {
      return this.i;
   }
}
