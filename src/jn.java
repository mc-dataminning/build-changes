import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jn implements jt {
   public static final jt.a<jn> a = new jt.a<jn>() {
      public jn a(ju<jn> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jn($$0, fi.a(kb.e.p(), $$1, false).a());
      }

      public jn a(ju<jn> $$0, ue $$1) {
         return new jn($$0, $$1.a(cvz.q));
      }
   };
   private final ju<jn> b;
   private final dip c;

   public static Codec<jn> a(ju<jn> $$0) {
      return dip.b.xmap($$1 -> new jn($$0, $$1), $$0x -> $$0x.c);
   }

   public jn(ju<jn> $$0, dip $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ue $$0) {
      $$0.a(cvz.q, this.c);
   }

   @Override
   public String a() {
      return kb.j.b(this.b()) + " " + fi.a(this.c);
   }

   @Override
   public ju<jn> b() {
      return this.b;
   }

   public dip c() {
      return this.c;
   }
}
