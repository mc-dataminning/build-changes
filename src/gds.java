import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gds {
   private final GameProfile a;
   private final Supplier<haf> b;
   private dfj c = dfj.e;
   private int d;
   @Nullable
   private xj e;
   @Nullable
   private ya f;
   private yf g;
   private int h;

   public gds(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<haf>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<haf> a(GameProfile $$0) {
      fke $$1 = fke.Q();
      hag $$2 = $$1.an();
      CompletableFuture<haf> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      haf $$5 = gzw.a($$0);
      return () -> {
         haf $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public ya b() {
      return this.f;
   }

   public yf c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(ya $$0) {
      this.f = $$0;
      this.g = $$0.a(cox.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yf b(boolean $$0) {
      return $$0 ? yf.c : yf.b;
   }

   public dfj e() {
      return this.c;
   }

   protected void a(dfj $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public haf g() {
      return this.b.get();
   }

   @Nullable
   public fay h() {
      return fke.Q().s.P().e(this.a().getName());
   }

   public void a(@Nullable xj $$0) {
      this.e = $$0;
   }

   @Nullable
   public xj i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
