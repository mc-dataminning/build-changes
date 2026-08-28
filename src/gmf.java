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

public class gmf {
   private static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<vv> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final gmd $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final gng $$3 = gng.a($$0.b);
      Optional<InetSocketAddress> $$4 = gni.a.a($$3).map(gnf::d);
      if ($$4.isEmpty()) {
         this.a(fyp.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final vv $$6 = vv.a($$5, false, null);
         this.c.add($$6);
         $$0.d = xg.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         akm $$7 = new akm() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(akn $$0x) {
               if (this.i) {
                  $$6.a(xg.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  ako $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = xg.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = xg.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = gmf.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<xg> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(xg.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(xg.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = xg.c("multiplayer.status.unknown").a(o.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(gmd.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = ag.c();
                  $$6.a(new akk(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(akh $$0x) {
               long $$1 = this.j;
               long $$2 = ag.c();
               $$0.f = $$2 - $$1;
               $$6.a(xg.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(vx $$0x) {
               if (!this.h) {
                  gmf.this.a($$0.a(), $$0);
                  gmf.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(akq.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(xg $$0, gmd $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = xf.a;
   }

   void a(InetSocketAddress $$0, final gng $$1, final gmd $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)vv.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new glw($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(gmd.b.d);
               $$2.h = xg.b($$2xx);
               $$2.d = xg.b($$3);
               $$2.c = gmf.a($$4, $$5);
               $$2.e = new ako.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static xg a(int $$0, int $$1) {
      xg $$2 = xg.b(Integer.toString($$0)).a(o.h);
      xg $$3 = xg.b(Integer.toString($$1)).a(o.h);
      return xg.a("multiplayer.status.player_count", $$2, $$3).a(o.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<vv> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vv $$1 = $$0.next();
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
         Iterator<vv> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vv $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(xg.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
