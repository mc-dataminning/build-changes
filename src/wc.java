import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class wc {
   private static final int a = 2097152;
   private final qr b;
   private final byte[] c;
   private final List<wc.a> d;

   public wc(dei $$0) {
      this.b = new qr();

      for (Entry<dhk.a, dhk> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new qy($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new sf(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<gu, czn> $$2 : $$0.G().entrySet()) {
         this.d.add(wc.a.a($$2.getValue()));
      }
   }

   public wc(sf $$0, int $$1, int $$2) {
      this.b = $$0.p();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.m();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.readBytes(this.c);
            this.d = $$0.a(wc.a::new);
         }
      }
   }

   public void a(sf $$0) {
      $$0.a(this.b);
      $$0.d(this.c.length);
      $$0.writeBytes(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dei $$0) {
      int $$1 = 0;

      for (dej $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(sf $$0, dei $$1) {
      for (dej $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<wc.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(wc.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      gu.a $$5 = new gu.a();

      for (wc.a $$6 : this.d) {
         int $$7 = $$3 + hx.b($$6.a >> 4);
         int $$8 = $$4 + hx.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public sf a() {
      return new sf(Unpooled.wrappedBuffer(this.c));
   }

   public qr b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final czp<?> c;
      @Nullable
      final qr d;

      private a(int $$0, int $$1, czp<?> $$2, @Nullable qr $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(sf $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(jb.l);
         this.d = $$0.p();
      }

      void a(sf $$0) {
         $$0.writeByte(this.a);
         $$0.writeShort(this.b);
         $$0.a(jb.l, this.c);
         $$0.a(this.d);
      }

      static wc.a a(czn $$0) {
         qr $$1 = $$0.ao_();
         gu $$2 = $$0.p();
         int $$3 = hx.b($$2.u()) << 4 | hx.b($$2.w());
         return new wc.a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(gu var1, czp<?> var2, @Nullable qr var3);
   }
}
