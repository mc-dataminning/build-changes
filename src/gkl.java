import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gkl {
   private final GameProfile a;
   private final Supplier<hjy> b;
   private dix c = dix.e;
   private int d;
   @Nullable
   private wy e;
   private boolean f = true;
   @Nullable
   private xp g;
   private xu h;
   private int i;

   public gkl(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hjy>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hjy> a(GameProfile $$0) {
      foz $$1 = foz.Q();
      hjz $$2 = $$1.an();
      CompletableFuture<Optional<hjy>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hjy $$5 = hjp.a($$0);
      return () -> {
         hjy $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xp b() {
      return this.g;
   }

   public xu c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xp $$0) {
      this.g = $$0;
      this.h = $$0.a(crg.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xu c(boolean $$0) {
      return $$0 ? xu.c : xu.b;
   }

   public dix e() {
      return this.c;
   }

   protected void a(dix $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hjy g() {
      return this.b.get();
   }

   @Nullable
   public ffq h() {
      return foz.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable wy $$0) {
      this.e = $$0;
   }

   @Nullable
   public wy i() {
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
