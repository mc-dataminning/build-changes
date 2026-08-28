import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gfw {
   private static final Logger a = LogUtils.getLogger();
   private static final xk b = xk.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<we> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final gfu $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final ggx $$3 = ggx.a($$0.b);
      Optional<InetSocketAddress> $$4 = ggz.a.a($$3).map(ggw::d);
      if ($$4.isEmpty()) {
         this.a(fsq.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final we $$6 = we.a($$5, false, null);
         this.c.add($$6);
         $$0.d = xk.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         akk $$7 = new akk() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(akl $$0x) {
               if (this.i) {
                  $$6.a(xk.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  akm $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = xk.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = xk.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = gfw.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<xk> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(xk.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(xk.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = xk.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(gfu.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = ae.c();
                  $$6.a(new aki(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(akf $$0x) {
               long $$1 = this.j;
               long $$2 = ae.c();
               $$0.f = $$2 - $$1;
               $$6.a(xk.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(wg $$0x) {
               if (!this.h) {
                  gfw.this.a($$0.a(), $$0);
                  gfw.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(ako.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(xk $$0, gfu $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = xj.a;
   }

   void a(InetSocketAddress $$0, final ggx $$1, final gfu $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)we.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new gfn($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(gfu.b.d);
               $$2.h = xk.b($$2xx);
               $$2.d = xk.b($$3);
               $$2.c = gfw.a($$4, $$5);
               $$2.e = new akm.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static xk a(int $$0, int $$1) {
      xk $$2 = xk.b(Integer.toString($$0)).a(n.h);
      xk $$3 = xk.b(Integer.toString($$1)).a(n.h);
      return xk.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<we> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            we $$1 = $$0.next();
            if ($$1.i()) {
               $$1.b();
            } else {
               $$0.remove();
               $$1.n();
            }
         }
      }
   }

   public void b() {
      synchronized (this.c) {
         Iterator<we> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            we $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(xk.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
