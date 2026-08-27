import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jr implements jx {
   public static final jx.a<jr> a = new jx.a<jr>() {
      public jr a(jy<jr> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jr($$0, fm.a(kf.e.p(), $$1, false).a());
      }
   };
   private final jy<jr> b;
   private final dlj c;

   public static Codec<jr> a(jy<jr> $$0) {
      return dlj.b.xmap($$1 -> new jr($$0, $$1), $$0x -> $$0x.c);
   }

   public static xo<? super vb, jr> b(jy<jr> $$0) {
      return xm.a(cys.q).a($$1 -> new jr($$0, $$1), $$0x -> $$0x.c);
   }

   public jr(jy<jr> $$0, dlj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a() {
      return kf.j.b(this.b()) + " " + fm.a(this.c);
   }

   @Override
   public jy<jr> b() {
      return this.b;
   }

   public dlj c() {
      return this.c;
   }
}
