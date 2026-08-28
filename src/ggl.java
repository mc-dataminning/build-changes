import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggl {
   private final GameProfile a;
   private final Supplier<hfu> b;
   private dgf c = dgf.e;
   private int d;
   @Nullable
   private wp e;
   private boolean f = true;
   @Nullable
   private xg g;
   private xl h;
   private int i;

   public ggl(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hfu>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hfu> a(GameProfile $$0) {
      flj $$1 = flj.Q();
      hfv $$2 = $$1.an();
      CompletableFuture<Optional<hfu>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hfu $$5 = hfl.a($$0);
      return () -> {
         hfu $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xg b() {
      return this.g;
   }

   public xl c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xg $$0) {
      this.g = $$0;
      this.h = $$0.a(cpa.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xl c(boolean $$0) {
      return $$0 ? xl.c : xl.b;
   }

   public dgf e() {
      return this.c;
   }

   protected void a(dgf $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hfu g() {
      return this.b.get();
   }

   @Nullable
   public fca h() {
      return flj.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable wp $$0) {
      this.e = $$0;
   }

   @Nullable
   public wp i() {
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
