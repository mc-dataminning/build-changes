import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
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
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
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

public class wc extends SimpleChannelInboundHandler<zp<?>> {
   private static final float h = 0.75F;
   private static final Logger i = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ae.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ae.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ae.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final Supplier<NioEventLoopGroup> e = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> f = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> g = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private static final wq<ajb> j = aja.b;
   private final zq k;
   private volatile boolean l = true;
   private final Queue<Consumer<wc>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile wo p;
   @Nullable
   private volatile wo q;
   @Nullable
   private we r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile we A;
   @Nullable
   vv B;

   public wc(zq $$0) {
      this.k = $$0;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      this.n = $$0.channel();
      this.o = this.n.remoteAddress();
      if (this.A != null) {
         this.a(this.A);
      }
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(xi.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof wv) {
         i.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               i.debug("Timeout", $$1);
               this.a(xi.c("disconnect.timeout"));
            } else {
               xi $$3 = xi.a("disconnect.genericReason", "Internal Exception: " + $$1);
               wo $$4 = this.q;
               we $$5;
               if ($$4 != null) {
                  $$5 = $$4.a($$3, $$1);
               } else {
                  $$5 = new we($$3);
               }

               if ($$2) {
                  i.debug("Failed to sent packet", $$1);
                  if (this.g() == zq.b) {
                     zp<?> $$7 = (zp<?>)(this.l ? new aji($$3) : new zy($$3));
                     this.a($$7, wp.a(() -> this.a($$5)));
                  } else {
                     this.a($$5);
                  }

                  this.m();
               } else {
                  i.debug("Double fault", $$1);
                  this.a($$5);
               }
            }
         }
      }
   }

   protected void a(ChannelHandlerContext $$0, zp<?> $$1) {
      if (this.n.isOpen()) {
         wo $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (alu var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(xi.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  i.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(xi.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends wo> void a(zp<T> $$0, wo $$1) {
      $$0.a((T)$$1);
   }

   private void b(wq<?> $$0, wo $$1) {
      Validate.notNull($$1, "packetListener", new Object[0]);
      zq $$2 = $$1.a();
      if ($$2 != this.k) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.k + ", but listener is " + $$2);
      } else {
         wd $$3 = $$1.b();
         if ($$0.a() != $$3) {
            throw new IllegalStateException("Listener protocol (" + $$3 + ") does not match requested one " + $$0);
         }
      }
   }

   private static void a(ChannelFuture $$0) {
      try {
         $$0.syncUninterruptibly();
      } catch (Exception var2) {
         if (var2 instanceof ClosedChannelException) {
            i.info("Connection closed during protocol change");
         } else {
            throw var2;
         }
      }
   }

   public <T extends wo> void a(wq<T> $$0, T $$1) {
      this.b($$0, $$1);
      if ($$0.b() != this.f()) {
         throw new IllegalStateException("Invalid inbound protocol: " + $$0.a());
      } else {
         this.q = $$1;
         this.p = null;
         wx.b $$2 = wx.a($$0);
         zo $$3 = $$0.d();
         if ($$3 != null) {
            wk $$4 = new wk($$3);
            $$2 = $$2.andThen($$1x -> $$1x.pipeline().addAfter("decoder", "bundler", $$4));
         }

         a(this.n.writeAndFlush($$2));
      }
   }

   public void a(wq<?> $$0) {
      if ($$0.b() != this.g()) {
         throw new IllegalStateException("Invalid outbound protocol: " + $$0.a());
      } else {
         wx.d $$1 = wx.b($$0);
         zo $$2 = $$0.d();
         if ($$2 != null) {
            wl $$3 = new wl($$2);
            $$1 = $$1.andThen($$1x -> $$1x.pipeline().addAfter("encoder", "unbundler", $$3));
         }

         boolean $$4 = $$0.a() == wd.d;
         a(this.n.writeAndFlush($$1.andThen($$1x -> this.l = $$4)));
      }
   }

   public void a(wo $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.k == zq.a && $$0.a() == zq.a && $$0.b() == j.a()) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, akd $$2) {
      this.a($$0, $$1, akj.b, akj.d, $$2, aix.a);
   }

   public void a(String $$0, int $$1, ajd $$2) {
      this.a($$0, $$1, ajk.b, ajk.d, $$2, aix.b);
   }

   public <S extends wu, C extends vz> void a(String $$0, int $$1, wq<S> $$2, wq<C> $$3, C $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5 ? aix.c : aix.b);
   }

   private <S extends wu, C extends vz> void a(String $$0, int $$1, wq<S> $$2, wq<C> $$3, C $$4, aix $$5) {
      if ($$2.a() != $$3.a()) {
         throw new IllegalStateException("Mismatched initial protocols");
      } else {
         this.p = $$4;
         this.a((Consumer<wc>)($$6 -> {
            this.a($$3, $$4);
            $$6.b(new aiy(ab.b().e(), $$0, $$1, $$5), null, true);
            this.a($$2);
         }));
      }
   }

   public void a(zp<?> $$0) {
      this.a($$0, null);
   }

   public void a(zp<?> $$0, @Nullable wp $$1) {
      this.a($$0, $$1, true);
   }

   public void a(zp<?> $$0, @Nullable wp $$1, boolean $$2) {
      if (this.i()) {
         this.r();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<wc> $$0) {
      if (this.i()) {
         this.r();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(zp<?> $$0, @Nullable wp $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(zp<?> $$0, @Nullable wp $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               zp<?> $$2x = $$1.b();
               if ($$2x != null) {
                  ChannelFuture $$3x = this.n.writeAndFlush($$2x);
                  $$3x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
               }
            }
         });
      }

      $$3.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   public void a() {
      if (this.i()) {
         this.q();
      } else {
         this.m.add(wc::q);
      }
   }

   private void q() {
      if (this.n.eventLoop().inEventLoop()) {
         this.n.flush();
      } else {
         this.n.eventLoop().execute(() -> this.n.flush());
      }
   }

   private void r() {
      if (this.n != null && this.n.isOpen()) {
         synchronized (this.m) {
            Consumer<wc> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void b() {
      this.r();
      if (this.q instanceof ww $$0) {
         $$0.d();
      }

      if (!this.i() && !this.t) {
         this.n();
      }

      if (this.n != null) {
         this.n.flush();
      }

      if (this.y++ % 20 == 0) {
         this.c();
      }

      if (this.B != null) {
         this.B.a();
      }
   }

   protected void c() {
      this.x = azk.h(0.75F, (float)this.v, this.x);
      this.w = azk.h(0.75F, (float)this.u, this.w);
      this.v = 0;
      this.u = 0;
   }

   public SocketAddress d() {
      return this.o;
   }

   public String a(boolean $$0) {
      if (this.o == null) {
         return "local";
      } else {
         return $$0 ? this.o.toString() : "IP hidden";
      }
   }

   public void a(xi $$0) {
      this.a(new we($$0));
   }

   public void a(we $$0) {
      if (this.n == null) {
         this.A = $$0;
      }

      if (this.i()) {
         this.n.close().awaitUninterruptibly();
         this.r = $$0;
      }
   }

   public boolean e() {
      return this.n instanceof LocalChannel || this.n instanceof LocalServerChannel;
   }

   public zq f() {
      return this.k;
   }

   public zq g() {
      return this.k.a();
   }

   public static wc a(InetSocketAddress $$0, boolean $$1, @Nullable bmx $$2) {
      wc $$3 = new wc(zq.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final wc $$2) {
      Class<? extends SocketChannel> $$3;
      EventLoopGroup $$4;
      if (Epoll.isAvailable() && $$1) {
         $$3 = EpollSocketChannel.class;
         $$4 = (EventLoopGroup)f.get();
      } else {
         $$3 = NioSocketChannel.class;
         $$4 = (EventLoopGroup)e.get();
      }

      return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$4)).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
            wc.a($$1, zq.b, false, $$2.B);
            $$2.a($$1);
         }
      })).channel($$3)).connect($$0.getAddress(), $$0.getPort());
   }

   private static String b(boolean $$0) {
      return $$0 ? "encoder" : "outbound_config";
   }

   private static String c(boolean $$0) {
      return $$0 ? "decoder" : "inbound_config";
   }

   public void a(ChannelPipeline $$0) {
      $$0.addLast("hackfix", new ChannelOutboundHandlerAdapter() {
         public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
            super.write($$0, $$1, $$2);
         }
      }).addLast("packet_handler", this);
   }

   public static void a(ChannelPipeline $$0, zq $$1, boolean $$2, @Nullable vv $$3) {
      zq $$4 = $$1.a();
      boolean $$5 = $$1 == zq.a;
      boolean $$6 = $$4 == zq.a;
      $$0.addLast("splitter", a($$3, $$2))
         .addLast(new ChannelHandler[]{new FlowControlHandler()})
         .addLast(c($$5), (ChannelHandler)($$5 ? new wm<ajb>(j) : new wx.a()))
         .addLast("prepender", d($$2))
         .addLast(b($$6), (ChannelHandler)($$6 ? new wn<ajb>(j) : new wx.c()));
   }

   private static ChannelOutboundHandler d(boolean $$0) {
      return (ChannelOutboundHandler)($$0 ? new wj() : new xc());
   }

   private static ChannelInboundHandler a(@Nullable vv $$0, boolean $$1) {
      if (!$$1) {
         return new xb($$0);
      } else {
         return (ChannelInboundHandler)($$0 != null ? new wh($$0) : new wi());
      }
   }

   public static void a(ChannelPipeline $$0, zq $$1) {
      a($$0, $$1, true, null);
   }

   public static wc a(SocketAddress $$0) {
      final wc $$1 = new wc(zq.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            ChannelPipeline $$1 = $$0.pipeline();
            wc.a($$1, zq.b);
            $$1.a($$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new vx($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new vy($$1));
   }

   public boolean h() {
      return this.s;
   }

   public boolean i() {
      return this.n != null && this.n.isOpen();
   }

   public boolean j() {
      return this.n == null;
   }

   @Nullable
   public wo k() {
      return this.q;
   }

   @Nullable
   public we l() {
      return this.r;
   }

   public void m() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof wa $$2) {
            $$2.a($$0, $$1);
         } else {
            this.n.pipeline().addAfter("splitter", "decompress", new wa($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof wb $$3) {
            $$3.a($$0);
         } else {
            this.n.pipeline().addAfter("prepender", "compress", new wb($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof wa) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof wb) {
            this.n.pipeline().remove("compress");
         }
      }
   }

   public void n() {
      if (this.n != null && !this.n.isOpen()) {
         if (this.t) {
            i.warn("handleDisconnection() called twice");
         } else {
            this.t = true;
            wo $$0 = this.k();
            wo $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               we $$2 = Objects.requireNonNullElseGet(this.l(), () -> new we(xi.c("multiplayer.disconnect.generic")));
               $$1.a($$2);
            }
         }
      }
   }

   public float o() {
      return this.w;
   }

   public float p() {
      return this.x;
   }

   public void a(bmx $$0) {
      this.B = new vv($$0);
   }
}
