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

public abstract class fvj implements zf {
   private static final ws i = ws.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final fcu a;
   protected final vq b;
   @Nullable
   protected final fwa c;
   @Nullable
   protected String d;
   protected final grs e;
   @Nullable
   protected final fkt f;
   protected boolean g;
   private final List<fvj.a> k = new ArrayList<>();
   protected final Map<akf, byte[]> h;

   protected fvj(fcu $$0, vq $$1, fvq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(zi $$0) {
      this.a(new zt($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zj $$0) {
      zc.a($$0, this, this.a);
      this.b(new zu($$0.b()));
   }

   @Override
   public void a(zg $$0) {
      aaa $$1 = $$0.b();
      if (!($$1 instanceof aab)) {
         zc.a($$0, this, this.a);
         if ($$1 instanceof zy $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aaa var1);

   @Override
   public void a(zl $$0) {
      zc.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zv($$1, zv.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fwa.a $$5 = this.c != null ? this.c.b() : fwa.a.c;
         if ($$5 != fwa.a.c && (!$$4 || $$5 != fwa.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zk $$0) {
      zc.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static ws a(ws $$0, @Nullable ws $$1) {
      return (ws)($$1 == null ? $$0 : ws.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abf $$0) {
      zc.a($$0, this, this.a);
      this.b.a(new abi($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zm $$0) {
      zc.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zn $$0) {
      zc.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(ws.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fxd $$1 = new fxd($$0.b(), $$0.e());
         fjm.a(Objects.requireNonNullElseGet(this.f, fky::new), this.a, $$1, this.c, false, new fwe(this.h));
      }
   }

   @Override
   public void a(zh $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fvj.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fvj.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(yz<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(ws $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fkt b(ws $$0) {
      fkt $$1 = Objects.requireNonNullElseGet(this.f, () -> new fnq(new fky()));
      return (fkt)(this.c != null && this.c.e() ? new gsm($$1, i, $$0) : new fju($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(yz<? extends we> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fvj.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fkt a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable ws $$4) {
      fkt $$5 = this.a.y;
      return $$5 instanceof fvj.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fvj.b(this.a, $$5, List.of(new fvj.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yz<? extends we> a, BooleanSupplier b, long c) {
   }

   class b extends fjl {
      private final List<fvj.b.a> r;
      @Nullable
      private final fkt s;

      b(fcu $$0, @Nullable fkt $$1, List<fvj.b.a> $$2, boolean $$3, @Nullable ws $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gpd $$6 = $$0.ae();
               if ($$5) {
                  if (fvj.this.c != null) {
                     fvj.this.c.a(fwa.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fvj.this.b.a(ws.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fvj.this.c != null) {
                     fvj.this.c.a(fwa.a.b);
                  }
               }

               for (fvj.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fvj.this.c != null) {
                  fwb.b(fvj.this.c);
               }
            },
            $$3 ? ws.c("multiplayer.requiredTexturePrompt.line1") : ws.c("multiplayer.texturePrompt.line1"),
            fvj.a($$3 ? ws.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : ws.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wr.i : wr.f,
            $$3 ? wr.p : wr.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fvj.b a(fcu $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable ws $$5) {
         List<fvj.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fvj.b.a($$1, $$2, $$3)).build();
         return fvj.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
