import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbs {
   private final GameProfile a;
   private final Supplier<gyc> b;
   private ded c = ded.e;
   private int d;
   @Nullable
   private xd e;
   @Nullable
   private xu f;
   private xz g;
   private int h;

   public gbs(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gyc>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gyc> a(GameProfile $$0) {
      fil $$1 = fil.Q();
      gyd $$2 = $$1.an();
      CompletableFuture<gyc> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gyc $$5 = gxt.a($$0);
      return () -> {
         gyc $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xu b() {
      return this.f;
   }

   public xz c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xu $$0) {
      this.f = $$0;
      this.g = $$0.a(cnx.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xz b(boolean $$0) {
      return $$0 ? xz.c : xz.b;
   }

   public ded e() {
      return this.c;
   }

   protected void a(ded $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gyc g() {
      return this.b.get();
   }

   @Nullable
   public ezs h() {
      return fil.Q().s.O().e(this.a().getName());
   }

   public void a(@Nullable xd $$0) {
      this.e = $$0;
   }

   @Nullable
   public xd i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
