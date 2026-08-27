import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jt implements jv {
   public static final jv.a<jt> a = new jv.a<jt>() {
      public jt a(jw<jt> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         ga.a $$2 = ga.a(kd.h.p(), $$1);
         cmr $$3 = new fz($$2.a(), $$2.b()).a(1, false);
         return new jt($$0, $$3);
      }

      public jt a(jw<jt> $$0, ug $$1) {
         return new jt($$0, $$1.r());
      }
   };
   private final jw<jt> b;
   private final cmr c;

   public static Codec<jt> a(jw<jt> $$0) {
      return cmr.a.xmap($$1 -> new jt($$0, $$1), $$0x -> $$0x.c);
   }

   public jt(jw<jt> $$0, cmr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return kd.j.b(this.b()) + " " + new fz(this.c.e(), this.c.v()).b();
   }

   @Override
   public jw<jt> b() {
      return this.b;
   }

   public cmr c() {
      return this.c;
   }
}
