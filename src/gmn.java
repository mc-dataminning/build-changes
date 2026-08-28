import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gmn {
   private final GameProfile a;
   private final Supplier<hmc> b;
   private dju c = dju.e;
   private int d;
   @Nullable
   private xa e;
   private boolean f = true;
   @Nullable
   private xr g;
   private xw h;
   private int i;

   public gmn(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hmc>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hmc> a(GameProfile $$0) {
      frd $$1 = frd.Q();
      hmd $$2 = $$1.an();
      CompletableFuture<Optional<hmc>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hmc $$5 = hls.a($$0);
      return () -> {
         hmc $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xr b() {
      return this.g;
   }

   public xw c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xr $$0) {
      this.g = $$0;
      this.h = $$0.a(csb.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xw c(boolean $$0) {
      return $$0 ? xw.c : xw.b;
   }

   public dju e() {
      return this.c;
   }

   protected void a(dju $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hmc g() {
      return this.b.get();
   }

   @Nullable
   public fgq h() {
      return frd.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable xa $$0) {
      this.e = $$0;
   }

   @Nullable
   public xa i() {
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
