import javax.annotation.Nullable;

public class gtj {
   private final gtq a;
   private final fef b;
   @Nullable
   private fil c;

   public gtj(gtq $$0, fef $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wx $$0 = wx.c("tutorial.bundleInsert.title");
      wx $$1 = wx.c("tutorial.bundleInsert.description");
      this.c = new fil(fil.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.av();
      }
   }

   public void a(ctq $$0, ctq $$1, cpd $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(ctt.qU)) {
            if ($$2 == cpd.a) {
               this.a();
            } else if ($$2 == cpd.b) {
               this.b();
            }
         } else if ($$0.a(ctt.qU) && !$$1.e() && $$2 == cpd.b) {
            this.b();
         }
      }
   }
}
