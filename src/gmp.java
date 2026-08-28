import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gmp {
   private final GameProfile a;
   private final Supplier<hme> b;
   private djw c = djw.e;
   private int d;
   @Nullable
   private xc e;
   private boolean f = true;
   @Nullable
   private xt g;
   private xy h;
   private int i;

   public gmp(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hme>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hme> a(GameProfile $$0) {
      frf $$1 = frf.Q();
      hmf $$2 = $$1.an();
      CompletableFuture<Optional<hme>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hme $$5 = hlu.a($$0);
      return () -> {
         hme $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xt b() {
      return this.g;
   }

   public xy c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(xt $$0) {
      this.g = $$0;
      this.h = $$0.a(csd.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static xy c(boolean $$0) {
      return $$0 ? xy.c : xy.b;
   }

   public djw e() {
      return this.c;
   }

   protected void a(djw $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hme g() {
      return this.b.get();
   }

   @Nullable
   public fgs h() {
      return frf.Q().s.R().e(this.a().getName());
   }

   public void a(@Nullable xc $$0) {
      this.e = $$0;
   }

   @Nullable
   public xc i() {
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
