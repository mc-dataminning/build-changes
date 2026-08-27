import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jw implements jq {
   public static final Codec<jw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlk.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, jw::new)
   );
   public static final jq.a<jw> b = new jq.a<jw>() {
      public jw a(jr<jw> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         ht $$6 = ht.a((double)$$2, (double)$$3, (double)$$4);
         return new jw(new dlc($$6), $$5);
      }

      public jw a(jr<jw> $$0, tu $$1) {
         dlk $$2 = dll.c($$1);
         int $$3 = $$1.n();
         return new jw($$2, $$3);
      }
   };
   private final dlk c;
   private final int d;

   public jw(dlk $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(tu $$0) {
      dll.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      eji $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", jy.k.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public jr<jw> b() {
      return js.P;
   }

   public dlk c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
