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

public abstract class gff implements aai {
   private static final xv k = xv.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fme a;
   protected final wp b;
   @Nullable
   protected final gfx c;
   @Nullable
   protected String d;
   protected final hgy e;
   @Nullable
   protected final ftw f;
   protected boolean g;
   private final List<gff.a> m = new ArrayList<>();
   protected final Map<alz, byte[]> h;
   protected Map<String, String> i;
   protected amr j;

   protected gff(fme $$0, wp $$1, gfn $$2) {
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
   public void a(aac $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      aai.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amr.b.a).map(amr.a::c);
      this.b.a(new wr(xv.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public wr a(xv $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amr.b.a).map(amr.a::c);
      return new wr($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable aac $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      aaf.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ae.f() + "-client.txt");
      Optional<amr.a> $$5 = this.j.a(amr.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(aac<?> $$0) {
      return aai.super.a($$0) ? true : this.g && ($$0 instanceof aar || $$0 instanceof aas);
   }

   @Override
   public void a(aam $$0) {
      this.a(new aay($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aan $$0) {
      aaf.a($$0, this, this.a);
      this.b(new aaz($$0.b()));
   }

   @Override
   public void a(aaj $$0) {
      abf $$1 = $$0.b();
      if (!($$1 instanceof abg)) {
         aaf.a($$0, this, this.a);
         if ($$1 instanceof abd $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(abf var1);

   @Override
   public void a(aap $$0) {
      aaf.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aba($$1, aba.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gfx.a $$5 = this.c != null ? this.c.b() : gfx.a.c;
         if ($$5 != gfx.a.c && (!$$4 || $$5 != gfx.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aao $$0) {
      aaf.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xv a(xv $$0, @Nullable xv $$1) {
      return (xv)($$1 == null ? $$0 : xv.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(acm $$0) {
      aaf.a($$0, this, this.a);
      this.b.a(new acp($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aar $$0) {
      aaf.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aak $$0) {
      aaf.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aaq $$0) {
      aaf.a($$0, this, this.a);
      List<amr.c> $$1 = $$0.b();
      Builder<amr.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amr.c $$3 : $$1) {
         try {
            URI $$4 = ae.a($$3.b());
            $$2.add(new amr.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amr($$2.build());
   }

   @Override
   public void a(aas $$0) {
      this.g = true;
      aaf.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xv.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gha $$1 = new gha($$0.b(), $$0.e());
         fsv.a(Objects.requireNonNullElseGet(this.f, fty::new), this.a, $$1, this.c, false, new ggb(this.h));
      }
   }

   @Override
   public void a(aal $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gff.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gff.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ae.c()) {
            $$0.remove();
         }
      }
   }

   public void b(aac<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wr $$0) {
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

   protected ftw b(wr $$0) {
      ftw $$1 = Objects.requireNonNullElseGet(this.f, () -> new fwm(new fty()));
      return (ftw)(this.c != null && this.c.e() ? new hhr($$1, k, $$0.a()) : new ftd($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(aac<? extends xh> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gff.a($$0, $$1, ae.c() + $$2.toMillis()));
      }
   }

   private ftw a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xv $$4) {
      ftw $$5 = this.a.z;
      return $$5 instanceof gff.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gff.b(this.a, $$5, List.of(new gff.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(aac<? extends xh> a, BooleanSupplier b, long c) {
   }

   class b extends fsu {
      private final List<gff.b.a> s;
      @Nullable
      private final ftw u;

      b(final fme $$0, @Nullable final ftw $$1, final List<gff.b.a> $$2, final boolean $$3, @Nullable final xv $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hei $$6 = $$0.af();
               if ($$5) {
                  if (gff.this.c != null) {
                     gff.this.c.a(gfx.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gff.this.b.a(xv.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gff.this.c != null) {
                     gff.this.c.a(gfx.a.b);
                  }
               }

               for (gff.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gff.this.c != null) {
                  gfy.b(gff.this.c);
               }
            },
            $$3 ? xv.c("multiplayer.requiredTexturePrompt.line1") : xv.c("multiplayer.texturePrompt.line1"),
            gff.a($$3 ? xv.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xv.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xu.i : xu.f,
            $$3 ? xu.p : xu.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gff.b a(fme $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xv $$5) {
         List<gff.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gff.b.a($$1, $$2, $$3)).build();
         return gff.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
