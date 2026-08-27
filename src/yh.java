import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class yh {
   private static final int a = 2097152;
   private final qy b;
   private final byte[] c;
   private final List<yh.a> d;

   public yh(dhs $$0) {
      this.b = new qy();

      for (Entry<dku.a, dku> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new rf($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new sq(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<gw, dcx> $$2 : $$0.G().entrySet()) {
         this.d.add(yh.a.a($$2.getValue()));
      }
   }

   public yh(sq $$0, int $$1, int $$2) {
      this.b = $$0.p();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.m();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = $$0.a(yh.a::new);
         }
      }
   }

   public void a(sq $$0) {
      $$0.a((rs)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dhs $$0) {
      int $$1 = 0;

      for (dht $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(sq $$0, dhs $$1) {
      for (dht $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<yh.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(yh.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      gw.a $$5 = new gw.a();

      for (yh.a $$6 : this.d) {
         int $$7 = $$3 + hz.b($$6.a >> 4);
         int $$8 = $$4 + hz.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public sq a() {
      return new sq(Unpooled.wrappedBuffer(this.c));
   }

   public qy b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final dcz<?> c;
      @Nullable
      final qy d;

      private a(int $$0, int $$1, dcz<?> $$2, @Nullable qy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(sq $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(jd.l);
         this.d = $$0.p();
      }

      void a(sq $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(jd.l, this.c);
         $$0.a((rs)this.d);
      }

      static yh.a a(dcx $$0) {
         qy $$1 = $$0.as_();
         gw $$2 = $$0.p();
         int $$3 = hz.b($$2.u()) << 4 | hz.b($$2.w());
         return new yh.a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(gw var1, dcz<?> var2, @Nullable qy var3);
   }
}
