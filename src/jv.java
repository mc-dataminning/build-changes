import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jv implements jx {
   public static final jx.a<jv> a = new jx.a<jv>() {
      public jv a(jy<jv> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         gc.a $$2 = gc.a(kf.h.p(), $$1);
         cpd $$3 = new gb($$2.a(), $$2.b()).a(1, false);
         return new jv($$0, $$3);
      }
   };
   private final jy<jv> b;
   private final cpd c;

   public static Codec<jv> a(jy<jv> $$0) {
      return cpd.a.xmap($$1 -> new jv($$0, $$1), $$0x -> $$0x.c);
   }

   public static xo<? super vb, jv> b(jy<jv> $$0) {
      return cpd.f.a($$1 -> new jv($$0, $$1), $$0x -> $$0x.c);
   }

   public jv(jy<jv> $$0, cpd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a() {
      return kf.j.b(this.b()) + " " + new gb(this.c.e(), this.c.w()).b();
   }

   @Override
   public jy<jv> b() {
      return this.b;
   }

   public cpd c() {
      return this.c;
   }
}
