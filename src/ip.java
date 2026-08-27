import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ip implements iv {
   public static final iv.a<ip> a = new iv.a<ip>() {
      public ip a(iw<ip> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new ip($$0, fi.a(jd.f.p(), $$1, false).a());
      }

      public ip a(iw<ip> $$0, sq $$1) {
         return new ip($$0, $$1.a(csx.o));
      }
   };
   private final iw<ip> b;
   private final dfl c;

   public static Codec<ip> a(iw<ip> $$0) {
      return dfl.b.xmap($$1 -> new ip($$0, $$1), $$0x -> $$0x.c);
   }

   public ip(iw<ip> $$0, dfl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sq $$0) {
      $$0.a(csx.o, this.c);
   }

   @Override
   public String a() {
      return jd.k.b(this.b()) + " " + fi.a(this.c);
   }

   @Override
   public iw<ip> b() {
      return this.b;
   }

   public dfl c() {
      return this.c;
   }
}
