import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record wx(UUID a, cjw b) {
   public xc a(Duration $$0) {
      return new xc.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xa.b a(UUID $$0) {
      return new xa($$0, this.a).a(this.b);
   }

   public wx.a a() {
      return new wx.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cjw d() {
      return this.b;
   }

   public static record a(UUID a, cjw.a b) {
      public static wx.a a(vg $$0) {
         return new wx.a($$0.n(), new cjw.a($$0));
      }

      public static void a(vg $$0, wx.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public wx a(GameProfile $$0, axw $$1) throws cjw.b {
         return new wx(this.a, cjw.a($$1, $$0.getId(), this.b));
      }
   }
}
