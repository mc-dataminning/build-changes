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

public class ggp {
   private static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<vi> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final ggn $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final ghq $$3 = ghq.a($$0.b);
      Optional<InetSocketAddress> $$4 = ghs.a.a($$3).map(ghp::d);
      if ($$4.isEmpty()) {
         this.a(ftj.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final vi $$6 = vi.a($$5, false, null);
         this.c.add($$6);
         $$0.d = wo.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         ajp $$7 = new ajp() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(ajq $$0x) {
               if (this.i) {
                  $$6.a(wo.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  ajr $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = wo.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = wo.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = ggp.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<wo> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(wo.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(wo.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = wo.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(ggn.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = af.c();
                  $$6.a(new ajn(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(ajk $$0x) {
               long $$1 = this.j;
               long $$2 = af.c();
               $$0.f = $$2 - $$1;
               $$6.a(wo.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(vk $$0x) {
               if (!this.h) {
                  ggp.this.a($$0.a(), $$0);
                  ggp.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(ajt.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(wo $$0, ggn $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = wn.a;
   }

   void a(InetSocketAddress $$0, final ghq $$1, final ggn $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)vi.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new ggg($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(ggn.b.d);
               $$2.h = wo.b($$2xx);
               $$2.d = wo.b($$3);
               $$2.c = ggp.a($$4, $$5);
               $$2.e = new ajr.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static wo a(int $$0, int $$1) {
      wo $$2 = wo.b(Integer.toString($$0)).a(n.h);
      wo $$3 = wo.b(Integer.toString($$1)).a(n.h);
      return wo.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<vi> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vi $$1 = $$0.next();
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
         Iterator<vi> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vi $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(wo.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
