import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fxq implements aab {
   private static final xo i = xo.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final ffd a;
   protected final wj b;
   @Nullable
   protected final fyh c;
   @Nullable
   protected String d;
   protected final gug e;
   @Nullable
   protected final fnb f;
   protected boolean g;
   private final List<fxq.a> k = new ArrayList<>();
   protected final Map<ale, byte[]> h;

   protected fxq(ffd $$0, wj $$1, fxx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(zv $$0, Exception $$1) {
      j.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      aab.super.a($$0, $$1);
      this.b.a(xo.c("disconnect.packetError"));
   }

   @Override
   public void a(aae $$0) {
      this.a(new aap($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aaf $$0) {
      zy.a($$0, this, this.a);
      this.b(new aaq($$0.b()));
   }

   @Override
   public void a(aac $$0) {
      aaw $$1 = $$0.b();
      if (!($$1 instanceof aax)) {
         zy.a($$0, this, this.a);
         if ($$1 instanceof aau $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aaw var1);

   @Override
   public void a(aah $$0) {
      zy.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aar($$1, aar.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fyh.a $$5 = this.c != null ? this.c.b() : fyh.a.c;
         if ($$5 != fyh.a.c && (!$$4 || $$5 != fyh.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aag $$0) {
      zy.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static xo a(xo $$0, @Nullable xo $$1) {
      return (xo)($$1 == null ? $$0 : xo.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(acc $$0) {
      zy.a($$0, this, this.a);
      this.b.a(new acf($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aai $$0) {
      zy.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aaj $$0) {
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(xo.c("disconnect.transfer"));
         this.a.c(() -> {
            this.b.m();
            this.b.n();
            fzk $$1 = new fzk($$0.b(), $$0.e());
            flu.a(Objects.requireNonNullElseGet(this.f, fng::new), this.a, $$1, this.c, false, new fyl(this.h));
         });
      }
   }

   @Override
   public void a(aad $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fxq.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fxq.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zv<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(xo $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fnb b(xo $$0) {
      fnb $$1 = Objects.requireNonNullElseGet(this.f, () -> new fpz(new fng()));
      return (fnb)(this.c != null && this.c.e() ? new gva($$1, i, $$0) : new fmc($$1, i, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zv<? extends xa> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fxq.a($$0, $$1, ac.c() + $$2.toMillis()));
      }
   }

   private fnb a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xo $$4) {
      fnb $$5 = this.a.y;
      return $$5 instanceof fxq.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fxq.b(this.a, $$5, List.of(new fxq.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zv<? extends xa> a, BooleanSupplier b, long c) {
   }

   class b extends flt {
      private final List<fxq.b.a> r;
      @Nullable
      private final fnb s;

      b(final ffd $$0, @Nullable final fnb $$1, final List<fxq.b.a> $$2, final boolean $$3, @Nullable final xo $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               grn $$6 = $$0.ae();
               if ($$5) {
                  if (fxq.this.c != null) {
                     fxq.this.c.a(fyh.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fxq.this.b.a(xo.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fxq.this.c != null) {
                     fxq.this.c.a(fyh.a.b);
                  }
               }

               for (fxq.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fxq.this.c != null) {
                  fyi.b(fxq.this.c);
               }
            },
            $$3 ? xo.c("multiplayer.requiredTexturePrompt.line1") : xo.c("multiplayer.texturePrompt.line1"),
            fxq.a($$3 ? xo.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xo.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xn.i : xn.f,
            $$3 ? xn.p : xn.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fxq.b a(ffd $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xo $$5) {
         List<fxq.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fxq.b.a($$1, $$2, $$3)).build();
         return fxq.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
