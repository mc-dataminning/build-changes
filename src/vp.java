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

public class vp extends SimpleChannelInboundHandler<zb<?>> {
   private static final float h = 0.75F;
   private static final Logger i = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ac.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ac.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ac.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final Supplier<NioEventLoopGroup> e = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> f = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> g = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private static final wc<aif> j = aie.a;
   private final zc k;
   private volatile boolean l = true;
   private final Queue<Consumer<vp>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile wa p;
   @Nullable
   private volatile wa q;
   @Nullable
   private wu r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile wu A;
   @Nullable
   vi B;

   public vp(zc $$0) {
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
      this.a(wu.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof wh) {
         i.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               i.debug("Timeout", $$1);
               this.a(wu.c("disconnect.timeout"));
            } else {
               wu $$3 = wu.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  i.debug("Failed to sent packet", $$1);
                  if (this.g() == zc.b) {
                     zb<?> $$4 = (zb<?>)(this.l ? new aim($$3) : new zj($$3));
                     this.a($$4, wb.a(() -> this.a($$3)));
                  } else {
                     this.a($$3);
                  }

                  this.m();
               } else {
                  i.debug("Double fault", $$1);
                  this.a($$3);
               }
            }
         }
      }
   }

   protected void a(ChannelHandlerContext $$0, zb<?> $$1) {
      if (this.n.isOpen()) {
         wa $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (akw var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(wu.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  i.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(wu.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends wa> void a(zb<T> $$0, wa $$1) {
      $$0.a((T)$$1);
   }

   private void b(wc<?> $$0, wa $$1) {
      Validate.notNull($$1, "packetListener", new Object[0]);
      zc $$2 = $$1.a();
      if ($$2 != this.k) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.k + ", but listener is " + $$2);
      } else {
         vq $$3 = $$1.b();
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

   public <T extends wa> void a(wc<T> $$0, T $$1) {
      this.b($$0, $$1);
      if ($$0.b() != this.f()) {
         throw new IllegalStateException("Invalid inbound protocol: " + $$0.a());
      } else {
         this.q = $$1;
         this.p = null;
         wj.b $$2 = wj.a($$0);
         za $$3 = $$0.d();
         if ($$3 != null) {
            vw $$4 = new vw($$3);
            $$2 = $$2.andThen($$1x -> $$1x.pipeline().addAfter("decoder", "bundler", $$4));
         }

         a(this.n.writeAndFlush($$2));
      }
   }

   public void a(wc<?> $$0) {
      if ($$0.b() != this.g()) {
         throw new IllegalStateException("Invalid outbound protocol: " + $$0.a());
      } else {
         wj.d $$1 = wj.b($$0);
         za $$2 = $$0.d();
         if ($$2 != null) {
            vx $$3 = new vx($$2);
            $$1 = $$1.andThen($$1x -> $$1x.pipeline().addAfter("encoder", "unbundler", $$3));
         }

         boolean $$4 = $$0.a() == vq.d;
         a(this.n.writeAndFlush($$1.andThen($$1x -> this.l = $$4)));
      }
   }

   public void a(wa $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.k == zc.a && $$0.a() == zc.a && $$0.b() == j.a()) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, ajh $$2) {
      this.a($$0, $$1, ajn.a, ajn.b, $$2, aib.a);
   }

   public void a(String $$0, int $$1, aih $$2) {
      this.a($$0, $$1, aio.a, aio.b, $$2, aib.b);
   }

   public <S extends wg, C extends vm> void a(String $$0, int $$1, wc<S> $$2, wc<C> $$3, C $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5 ? aib.c : aib.b);
   }

   private <S extends wg, C extends vm> void a(String $$0, int $$1, wc<S> $$2, wc<C> $$3, C $$4, aib $$5) {
      if ($$2.a() != $$3.a()) {
         throw new IllegalStateException("Mismatched initial protocols");
      } else {
         this.p = $$4;
         this.a((Consumer<vp>)($$6 -> {
            this.a($$3, $$4);
            $$6.b(new aic(aa.b().e(), $$0, $$1, $$5), null, true);
            this.a($$2);
         }));
      }
   }

   public void a(zb<?> $$0) {
      this.a($$0, null);
   }

   public void a(zb<?> $$0, @Nullable wb $$1) {
      this.a($$0, $$1, true);
   }

   public void a(zb<?> $$0, @Nullable wb $$1, boolean $$2) {
      if (this.i()) {
         this.r();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<vp> $$0) {
      if (this.i()) {
         this.r();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(zb<?> $$0, @Nullable wb $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(zb<?> $$0, @Nullable wb $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               zb<?> $$2x = $$1.b();
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
         this.m.add(vp::q);
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
            Consumer<vp> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void b() {
      this.r();
      if (this.q instanceof wi $$0) {
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
      this.x = ayg.i(0.75F, (float)this.v, this.x);
      this.w = ayg.i(0.75F, (float)this.u, this.w);
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

   public void a(wu $$0) {
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

   public zc f() {
      return this.k;
   }

   public zc g() {
      return this.k.a();
   }

   public static vp a(InetSocketAddress $$0, boolean $$1, @Nullable blg $$2) {
      vp $$3 = new vp(zc.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final vp $$2) {
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
            vp.a($$1, zc.b, false, $$2.B);
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

   public static void a(ChannelPipeline $$0, zc $$1, boolean $$2, @Nullable vi $$3) {
      zc $$4 = $$1.a();
      boolean $$5 = $$1 == zc.a;
      boolean $$6 = $$4 == zc.a;
      $$0.addLast("splitter", a($$3, $$2))
         .addLast(new ChannelHandler[]{new FlowControlHandler()})
         .addLast(c($$5), (ChannelHandler)($$5 ? new vy<aif>(j) : new wj.a()))
         .addLast("prepender", d($$2))
         .addLast(b($$6), (ChannelHandler)($$6 ? new vz<aif>(j) : new wj.c()));
   }

   private static ChannelOutboundHandler d(boolean $$0) {
      return (ChannelOutboundHandler)($$0 ? new vv() : new wo());
   }

   private static ChannelInboundHandler a(@Nullable vi $$0, boolean $$1) {
      if (!$$1) {
         return new wn($$0);
      } else {
         return (ChannelInboundHandler)($$0 != null ? new vt($$0) : new vu());
      }
   }

   public static void a(ChannelPipeline $$0, zc $$1) {
      a($$0, $$1, true, null);
   }

   public static vp a(SocketAddress $$0) {
      final vp $$1 = new vp(zc.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            ChannelPipeline $$1 = $$0.pipeline();
            vp.a($$1, zc.b);
            $$1.a($$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new vk($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new vl($$1));
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
   public wa k() {
      return this.q;
   }

   @Nullable
   public wu l() {
      return this.r;
   }

   public void m() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof vn $$2) {
            $$2.a($$0, $$1);
         } else {
            this.n.pipeline().addAfter("splitter", "decompress", new vn($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof vo $$3) {
            $$3.a($$0);
         } else {
            this.n.pipeline().addAfter("prepender", "compress", new vo($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof vn) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof vo) {
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
            wa $$0 = this.k();
            wa $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               wu $$2 = Objects.requireNonNullElseGet(this.l(), () -> wu.c("multiplayer.disconnect.generic"));
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

   public void a(blg $$0) {
      this.B = new vi($$0);
   }
}
