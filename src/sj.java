import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class sj extends SimpleChannelInboundHandler<va<?>> {
   private static final float j = 0.75F;
   private static final Logger k = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ac.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ac.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ac.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final AttributeKey<sk.a<?>> e = AttributeKey.valueOf("serverbound_protocol");
   public static final AttributeKey<sk.a<?>> f = AttributeKey.valueOf("clientbound_protocol");
   public static final Supplier<NioEventLoopGroup> g = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> h = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> i = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final vb l;
   private final Queue<Consumer<sj>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile sr p;
   @Nullable
   private volatile sr q;
   @Nullable
   private ti r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile ti A;
   @Nullable
   sb B;

   public sj(vb $$0) {
      this.l = $$0;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      this.n = $$0.channel();
      this.o = this.n.remoteAddress();
      if (this.A != null) {
         this.a(this.A);
      }
   }

   public static void a(Channel $$0) {
      $$0.attr(e).set(sk.a.b(vb.a));
      $$0.attr(f).set(sk.a.b(vb.b));
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(ti.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof sw) {
         k.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               k.debug("Timeout", $$1);
               this.a(ti.c("disconnect.timeout"));
            } else {
               ti $$3 = ti.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  k.debug("Failed to sent packet", $$1);
                  if (this.i() == vb.b) {
                     sk $$4 = ((sk.a)this.n.attr(f).get()).a();
                     va<?> $$5 = (va<?>)($$4 == sk.d ? new adh($$3) : new vf($$3));
                     this.a($$5, ss.a(() -> this.a($$3)));
                  } else {
                     this.a($$3);
                  }

                  this.o();
               } else {
                  k.debug("Double fault", $$1);
                  this.a($$3);
               }
            }
         }
      }
   }

   protected void a(ChannelHandlerContext $$0, va<?> $$1) {
      if (this.n.isOpen()) {
         sr $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (aff var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(ti.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  k.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(ti.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends sr> void a(va<T> $$0, sr $$1) {
      $$0.a((T)$$1);
   }

   public void a() {
      this.n.config().setAutoRead(false);
   }

   public void b() {
      this.n.config().setAutoRead(true);
   }

   public void a(sr $$0) {
      Validate.notNull($$0, "packetListener", new Object[0]);
      vb $$1 = $$0.a();
      if ($$1 != this.l) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.l + ", but listener is " + $$1);
      } else {
         sk $$2 = $$0.b();
         sk $$3 = ((sk.a)this.n.attr(a($$1)).get()).a();
         if ($$3 != $$2) {
            throw new IllegalStateException("Trying to set listener for protocol " + $$2.a() + ", but current " + $$1 + " protocol is " + $$3.a());
         } else {
            this.q = $$0;
            this.p = null;
         }
      }
   }

   public void b(sr $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.l == vb.a && $$0.a() == vb.a && $$0.b() == sk.a) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, adu $$2) {
      this.a($$0, $$1, $$2, acy.a);
   }

   public void a(String $$0, int $$1, adc $$2) {
      this.a($$0, $$1, $$2, acy.b);
   }

   private void a(String $$0, int $$1, sr $$2, acy $$3) {
      this.p = $$2;
      this.a((Consumer<sj>)($$4 -> {
         $$4.a($$3);
         this.a($$2);
         $$4.b(new acz(aa.b().e(), $$0, $$1, $$3), null, true);
      }));
   }

   public void a(acy $$0) {
      this.n.attr(f).set($$0.b().b(vb.b));
   }

   public void a(va<?> $$0) {
      this.a($$0, null);
   }

   public void a(va<?> $$0, @Nullable ss $$1) {
      this.a($$0, $$1, true);
   }

   public void a(va<?> $$0, @Nullable ss $$1, boolean $$2) {
      if (this.k()) {
         this.t();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<sj> $$0) {
      if (this.k()) {
         this.t();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(va<?> $$0, @Nullable ss $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(va<?> $$0, @Nullable ss $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               va<?> $$2x = $$1.b();
               if ($$2x != null) {
                  ChannelFuture $$3x = this.n.writeAndFlush($$2x);
                  $$3x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
               }
            }
         });
      }

      $$3.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   public void c() {
      if (this.k()) {
         this.s();
      } else {
         this.m.add(sj::s);
      }
   }

   private void s() {
      if (this.n.eventLoop().inEventLoop()) {
         this.n.flush();
      } else {
         this.n.eventLoop().execute(() -> this.n.flush());
      }
   }

   private static AttributeKey<sk.a<?>> a(vb $$0) {
      return switch ($$0) {
         case b -> f;
         case a -> e;
      };
   }

   private void t() {
      if (this.n != null && this.n.isOpen()) {
         synchronized (this.m) {
            Consumer<sj> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void d() {
      this.t();
      if (this.q instanceof sx $$0) {
         $$0.e();
      }

      if (!this.k() && !this.t) {
         this.p();
      }

      if (this.n != null) {
         this.n.flush();
      }

      if (this.y++ % 20 == 0) {
         this.e();
      }

      if (this.B != null) {
         this.B.a();
      }
   }

   protected void e() {
      this.x = ars.i(0.75F, (float)this.v, this.x);
      this.w = ars.i(0.75F, (float)this.u, this.w);
      this.v = 0;
      this.u = 0;
   }

   public SocketAddress f() {
      return this.o;
   }

   public String a(boolean $$0) {
      if (this.o == null) {
         return "local";
      } else {
         return $$0 ? this.o.toString() : "IP hidden";
      }
   }

   public void a(ti $$0) {
      if (this.n == null) {
         this.A = $$0;
      }

      if (this.k()) {
         this.n.close().awaitUninterruptibly();
         this.r = $$0;
      }
   }

   public boolean g() {
      return this.n instanceof LocalChannel || this.n instanceof LocalServerChannel;
   }

   public vb h() {
      return this.l;
   }

   public vb i() {
      return this.l.a();
   }

   public static sj a(InetSocketAddress $$0, boolean $$1, @Nullable arz $$2) {
      sj $$3 = new sj(vb.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final sj $$2) {
      Class<? extends SocketChannel> $$3;
      EventLoopGroup $$4;
      if (Epoll.isAvailable() && $$1) {
         $$3 = EpollSocketChannel.class;
         $$4 = (EventLoopGroup)h.get();
      } else {
         $$3 = NioSocketChannel.class;
         $$4 = (EventLoopGroup)g.get();
      }

      return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$4)).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            sj.a($$0);

            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
            sj.a($$1, vb.b, $$2.B);
            $$1.addLast("packet_handler", $$2);
         }
      })).channel($$3)).connect($$0.getAddress(), $$0.getPort());
   }

   public static void a(ChannelPipeline $$0, vb $$1, @Nullable sb $$2) {
      vb $$3 = $$1.a();
      AttributeKey<sk.a<?>> $$4 = a($$1);
      AttributeKey<sk.a<?>> $$5 = a($$3);
      $$0.addLast("splitter", new tb($$2))
         .addLast("decoder", new so($$4))
         .addLast("prepender", new tc())
         .addLast("encoder", new sp($$5))
         .addLast("unbundler", new sn($$5))
         .addLast("bundler", new sm($$4));
   }

   private static void b(ChannelPipeline $$0, vb $$1) {
      vb $$2 = $$1.a();
      AttributeKey<sk.a<?>> $$3 = a($$1);
      AttributeKey<sk.a<?>> $$4 = a($$2);
      $$0.addLast("validator", new sq($$3, $$4));
   }

   public static void a(ChannelPipeline $$0, vb $$1) {
      b($$0, $$1);
   }

   public static sj a(SocketAddress $$0) {
      final sj $$1 = new sj(vb.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)i.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            sj.a($$0);
            ChannelPipeline $$1 = $$0.pipeline();
            sj.a($$1, vb.b);
            $$1.addLast("packet_handler", $$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new sd($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new se($$1));
   }

   public boolean j() {
      return this.s;
   }

   public boolean k() {
      return this.n != null && this.n.isOpen();
   }

   public boolean l() {
      return this.n == null;
   }

   @Nullable
   public sr m() {
      return this.q;
   }

   @Nullable
   public ti n() {
      return this.r;
   }

   public void o() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof sh) {
            ((sh)this.n.pipeline().get("decompress")).a($$0, $$1);
         } else {
            this.n.pipeline().addBefore("decoder", "decompress", new sh($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof si) {
            ((si)this.n.pipeline().get("compress")).a($$0);
         } else {
            this.n.pipeline().addBefore("encoder", "compress", new si($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof sh) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof si) {
            this.n.pipeline().remove("compress");
         }
      }
   }

   public void p() {
      if (this.n != null && !this.n.isOpen()) {
         if (this.t) {
            k.warn("handleDisconnection() called twice");
         } else {
            this.t = true;
            sr $$0 = this.m();
            sr $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               ti $$2 = Objects.requireNonNullElseGet(this.n(), () -> ti.c("multiplayer.disconnect.generic"));
               $$1.a($$2);
            }
         }
      }
   }

   public float q() {
      return this.w;
   }

   public float r() {
      return this.x;
   }

   public void a(arz $$0) {
      this.B = new sb($$0);
   }
}
