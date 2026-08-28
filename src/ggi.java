import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggi {
   private final GameProfile a;
   private final Supplier<hfo> b;
   private dgd c = dgd.e;
   private int d;
   @Nullable
   private wo e;
   private boolean f = true;
   @Nullable
   private xf g;
   private xk h;
   private int i;

   public ggi(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hfo>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hfo> a(GameProfile $$0) {
      flh $$1 = flh.Q();
      hfp $$2 = $$1.an();
      CompletableFuture<Optional<hfo>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hfo $$5 = hff.a($$0);
      return () -> {
         hfo $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xf b() {
      return this.g;
   }

   public xk c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xf $$0) {
      this.g = $$0;
      this.h = $$0.a(coy.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xk c(boolean $$0) {
      return $$0 ? xk.c : xk.b;
   }

   public dgd e() {
      return this.c;
   }

   protected void a(dgd $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hfo g() {
      return this.b.get();
   }

   @Nullable
   public fby h() {
      return flh.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable wo $$0) {
      this.e = $$0;
   }

   @Nullable
   public wo i() {
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
