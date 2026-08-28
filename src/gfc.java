import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gfc implements zx {
   private static final xk k = xk.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final flz a;
   protected final we b;
   @Nullable
   protected final gfu c;
   @Nullable
   protected String d;
   protected final hgw e;
   @Nullable
   protected final ftr f;
   protected boolean g;
   private final List<gfc.a> m = new ArrayList<>();
   protected final Map<alp, byte[]> h;
   protected Map<String, String> i;
   protected amh j;

   protected gfc(flz $$0, we $$1, gfk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zr $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zx.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amh.b.a).map(amh.a::c);
      this.b.a(new wg(xk.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public wg a(xk $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amh.b.a).map(amh.a::c);
      return new wg($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zr $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zu.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ae.f() + "-client.txt");
      Optional<amh.a> $$5 = this.j.a(amh.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zr<?> $$0) {
      return zx.super.a($$0) ? true : this.g && ($$0 instanceof aag || $$0 instanceof aah);
   }

   @Override
   public void a(aab $$0) {
      this.a(new aan($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aac $$0) {
      zu.a($$0, this, this.a);
      this.b(new aao($$0.b()));
   }

   @Override
   public void a(zy $$0) {
      aau $$1 = $$0.b();
      if (!($$1 instanceof aav)) {
         zu.a($$0, this, this.a);
         if ($$1 instanceof aas $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aau var1);

   @Override
   public void a(aae $$0) {
      zu.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aap($$1, aap.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gfu.a $$5 = this.c != null ? this.c.b() : gfu.a.c;
         if ($$5 != gfu.a.c && (!$$4 || $$5 != gfu.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aad $$0) {
      zu.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xk a(xk $$0, @Nullable xk $$1) {
      return (xk)($$1 == null ? $$0 : xk.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(acb $$0) {
      zu.a($$0, this, this.a);
      this.b.a(new ace($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aag $$0) {
      zu.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zz $$0) {
      zu.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aaf $$0) {
      zu.a($$0, this, this.a);
      List<amh.c> $$1 = $$0.b();
      Builder<amh.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amh.c $$3 : $$1) {
         try {
            URI $$4 = ae.a($$3.b());
            $$2.add(new amh.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amh($$2.build());
   }

   @Override
   public void a(aah $$0) {
      this.g = true;
      zu.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xk.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         ggx $$1 = new ggx($$0.b(), $$0.e());
         fsq.a(Objects.requireNonNullElseGet(this.f, ftt::new), this.a, $$1, this.c, false, new gfy(this.h));
      }
   }

   @Override
   public void a(aaa $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gfc.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gfc.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ae.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zr<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wg $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected ftr b(wg $$0) {
      ftr $$1 = Objects.requireNonNullElseGet(this.f, () -> new fwh(new ftt()));
      return (ftr)(this.c != null && this.c.e() ? new hhp($$1, k, $$0.a()) : new fsy($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zr<? extends ww> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gfc.a($$0, $$1, ae.c() + $$2.toMillis()));
      }
   }

   private ftr a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xk $$4) {
      ftr $$5 = this.a.z;
      return $$5 instanceof gfc.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gfc.b(this.a, $$5, List.of(new gfc.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zr<? extends ww> a, BooleanSupplier b, long c) {
   }

   class b extends fsp {
      private final List<gfc.b.a> s;
      @Nullable
      private final ftr u;

      b(final flz $$0, @Nullable final ftr $$1, final List<gfc.b.a> $$2, final boolean $$3, @Nullable final xk $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hef $$6 = $$0.af();
               if ($$5) {
                  if (gfc.this.c != null) {
                     gfc.this.c.a(gfu.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gfc.this.b.a(xk.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gfc.this.c != null) {
                     gfc.this.c.a(gfu.a.b);
                  }
               }

               for (gfc.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gfc.this.c != null) {
                  gfv.b(gfc.this.c);
               }
            },
            $$3 ? xk.c("multiplayer.requiredTexturePrompt.line1") : xk.c("multiplayer.texturePrompt.line1"),
            gfc.a($$3 ? xk.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xk.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xj.i : xj.f,
            $$3 ? xj.p : xj.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gfc.b a(flz $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xk $$5) {
         List<gfc.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gfc.b.a($$1, $$2, $$3)).build();
         return gfc.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
