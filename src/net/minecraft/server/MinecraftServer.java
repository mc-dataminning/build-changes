package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bfk<afk> implements afg, dq, AutoCloseable {
   private static final Logger n = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float o = 0.8F;
   private static final int p = 100;
   public static final int c = 50;
   private static final int q = 2000;
   private static final int r = 15000;
   private static final long s = 5000000000L;
   private static final int t = 12;
   public static final int d = 11;
   private static final int u = 441;
   private static final int v = 6000;
   private static final int w = 3;
   public static final int e = 29999984;
   public static final cpp f = new cpp("Demo World", cpi.a, false, bgn.c, false, new cph(), cqe.c);
   private static final long x = 50L;
   public static final GameProfile g = new GameProfile(ac.d, "Anonymous Player");
   protected final ebw.c h;
   protected final ebz i;
   private final List<Runnable> y = Lists.newArrayList();
   private bes z = ber.a;
   private bdh A = this.z.f();
   private Consumer<bdg> B = $$0x -> this.aO();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final alh G;
   private final aku H;
   @Nullable
   private adu I;
   @Nullable
   private adu.a J;
   private final aru K = aru.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final hl<afa> O;
   private final Map<aeq<cpl>, akk> P = Maps.newLinkedHashMap();
   private anz Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   protected final Proxy j;
   private boolean U;
   private boolean V;
   private boolean W;
   private boolean X;
   @Nullable
   private String Y;
   private int Z;
   public final long[] k = new long[100];
   @Nullable
   private KeyPair aa;
   @Nullable
   private GameProfile ab;
   private boolean ac;
   private volatile boolean ad;
   private long ae;
   protected final afj l;
   private long af;
   private final Thread ag;
   private long ah = ac.b();
   private long ai;
   private boolean aj;
   private final amx ak;
   private final afi al = new afi(this);
   @Nullable
   private ebp am;
   private final afq an = new afq();
   private final aff ao;
   private boolean ap;
   private float aq;
   private final Executor ar;
   @Nullable
   private String as;
   private MinecraftServer.a at;
   private final dys au;
   protected final ecc m;
   private volatile boolean av;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> n.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, ebw.c $$1, amx $$2, afm $$3, Proxy $$4, DataFixer $$5, afj $$6, aku $$7) {
      super("Server");
      this.O = $$3.c();
      this.m = $$3.d();
      if (!this.O.a().d(jc.aI).c(dij.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.j = $$4;
         this.ak = $$2;
         this.at = new MinecraftServer.a($$3.a(), $$3.b());
         this.l = $$6;
         if ($$6.e() != null) {
            $$6.e().a(this);
         }

         this.G = new alh(this);
         this.H = $$7;
         this.h = $$1;
         this.i = $$1.c();
         this.L = $$5;
         this.ao = new aff(this, this.at.b.a());
         hf<csl> $$8 = this.O.a().d(jc.e).p().a(this.m.M());
         this.au = new dys($$3.a(), $$1, $$5, $$8);
         this.ag = $$0;
         this.ar = ac.f();
      }
   }

   private void a(ebs $$0) {
      $$0.a(this.aF().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void n_() {
      if (!bdn.e.c()) {
      }

      boolean $$0 = false;
      bdq $$1 = bdn.e.e();
      this.m.a(this.getServerModName(), this.K().a());
      akt $$2 = this.H.create(11);
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bdn.e.b();
         } catch (Throwable var5) {
            n.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(akt $$0) {
      ecb $$1 = this.m.K();
      boolean $$2 = this.m.C();
      hr<dij> $$3 = this.O.a().d(jc.aI);
      dlg $$4 = this.m.A();
      long $$5 = $$4.b();
      long $$6 = cql.a($$5);
      List<coy> $$7 = ImmutableList.of(new dku(), new dkt(), new cav(), new btv(), new cbg($$1));
      dij $$8 = $$3.a(dij.b);
      akk $$9 = new akk(this, this.ar, this.h, $$1, cpl.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(cpl.h, $$9);
      ebs $$10 = $$9.s();
      this.a($$10);
      this.am = new ebp($$10);
      dgq $$11 = $$9.w_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.m);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ac().a($$9);
      if (this.m.G() != null) {
         this.aJ().a(this.m.G());
      }

      bgw $$14 = $$9.H();

      for (Entry<aeq<dij>, dij> $$15 : $$3.g()) {
         aeq<dij> $$16 = $$15.getKey();
         if ($$16 != dij.b) {
            aeq<cpl> $$17 = aeq.a(jc.aH, $$16.a());
            ebr $$18 = new ebr(this.m, $$1);
            akk $$19 = new akk(this, this.ar, this.h, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dgo.a($$19.w_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(akk $$0, ecb $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(gu.b.b(80), 0.0F);
      } else {
         aki $$4 = $$0.k();
         cos $$5 = new cos($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.C_()) {
            gu $$7 = $$5.l();
            $$6 = $$0.a(dki.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for (int $$13 = 0; $$13 < arp.h(11); $$13++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               gu $$14 = akf.a($$0, new cos($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.B_().c(jc.as).flatMap($$0x -> $$0x.b(on.m)).ifPresent($$3x -> ((dmz)$$3x.a()).a($$0, $$4.g(), $$0.z, new gu($$1.a(), $$1.b(), $$1.c())));
         }
      }
   }

   private void a(ecc $$0) {
      $$0.a(bgn.a);
      $$0.d(true);
      ecb $$1 = $$0.K();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(cpi.d);
   }

   private void b(akt $$0) {
      akk $$1 = this.D();
      n.info("Preparing start region for dimension {}", $$1.ac().a());
      gu $$2 = $$1.R();
      $$0.a(new cos($$2));
      aki $$3 = $$1.k();
      this.ah = ac.b();
      $$3.a(akp.a, new cos($$2), 11, asp.a);

      while ($$3.b() != 441) {
         this.ah = ac.b() + 10L;
         this.p_();
      }

      this.ah = ac.b() + 10L;
      this.p_();

      for (akk $$4 : this.P.values()) {
         cpg $$5 = $$4.s().b(cpg.a(), "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.b().iterator();

            while ($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               cos $$8 = new cos($$7);
               $$4.k().a($$8, true);
            }
         }
      }

      this.ah = ac.b() + 10L;
      this.p_();
      $$0.b();
      this.bs();
   }

   public cpi o_() {
      return this.m.m();
   }

   public boolean h() {
      return this.m.n();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (akk $$4 : this.F()) {
         if (!$$0) {
            n.info("Saving chunks for level '{}'/{}", $$4, $$4.ac().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      akk $$5 = this.D();
      ecb $$6 = this.m.K();
      $$6.a($$5.w_().t());
      this.m.a(this.aJ().c());
      this.h.a(this.aU(), this.m, this.ac().r());
      if ($$1) {
         for (akk $$7 : this.F()) {
            n.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.k().a.n());
         }

         n.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.av = true;
         this.ac().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.av = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.z.e()) {
         this.aQ();
      }

      n.info("Stopping server");
      this.ad().b();
      this.av = true;
      if (this.Q != null) {
         n.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      n.info("Saving worlds");

      for (akk $$0 : this.F()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.k().a.f())) {
         this.ah = ac.b() + 1L;

         for (akk $$1 : this.F()) {
            $$1.k().o();
            $$1.k().a(() -> true, false);
         }

         this.p_();
      }

      this.a(false, true, false);

      for (akk $$2 : this.F()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               n.error("Exception closing the level", var5);
            }
         }
      }

      this.av = false;
      this.at.close();

      try {
         this.h.close();
      } catch (IOException var4) {
         n.error("Failed to unlock level {}", this.h.b(), var4);
      }
   }

   public String u() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean v() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.ag.join();
         } catch (InterruptedException var3) {
            n.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ah = ac.b();
         this.J = this.bh().orElse(null);
         this.I = this.bi();

         while (this.R) {
            long $$0 = ac.b() - this.ah;
            if ($$0 > 2000L && this.ah - this.ae >= 15000L) {
               long $$1 = $$0 / 50L;
               n.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$0, $$1);
               this.ah += $$1 * 50L;
               this.ae = this.ah;
            }

            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.c(), this.T);
            }

            this.ah += 50L;
            this.bt();
            this.A.a("tick");
            this.a(this::bf);
            this.A.b("nextTickWait");
            this.aj = true;
            this.ai = Math.max(ac.b() + 50L, this.ah);
            this.p_();
            this.A.c();
            this.bu();
            this.ad = true;
            bdn.e.a(this.aq);
         }
      } catch (Throwable var44) {
         n.error("Encountered an unexpected exception", var44);
         o $$4 = a(var44);
         this.b($$4.g());
         File $$5 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$4.a($$5)) {
            n.error("This crash report has been saved to: {}", $$5.getAbsolutePath());
         } else {
            n.error("We were unable to save this crash report to disk.");
         }

         this.a($$4);
      } finally {
         try {
            this.S = true;
            this.t();
         } catch (Throwable var42) {
            n.error("Exception stopping the server", var42);
         } finally {
            if (this.l.e() != null) {
               this.l.e().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bf() {
      return this.br() || ac.b() < (this.aj ? this.ai : this.ah);
   }

   protected void p_() {
      this.bp();
      this.c(() -> !this.bf());
   }

   protected afk a(Runnable $$0) {
      return new afk(this.T, $$0);
   }

   protected boolean a(afk $$0) {
      return $$0.a() + 3 < this.T || this.bf();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bg();
      this.aj = $$0;
      return $$0;
   }

   private boolean bg() {
      if (super.x()) {
         return true;
      } else {
         if (this.bf()) {
            for (akk $$0 : this.F()) {
               if ($$0.k().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(afk $$0) {
      this.aM().d("runTask");
      super.d($$0);
   }

   private Optional<adu.a> bh() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.h.f().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new adu.a($$2.toByteArray()));
         } catch (Exception var3) {
            n.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.h.f();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.T++;
      this.b($$0);
      if ($$1 - this.af >= 5000000000L) {
         this.af = $$1;
         this.I = this.bi();
      }

      if (this.T % 6000 == 0) {
         n.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         n.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = this.k[this.T % 100] = ac.c() - $$1;
      this.aq = this.aq * 0.8F + (float)$$2 / 1000000.0F * 0.19999999F;
      long $$3 = ac.c();
      this.a($$3 - $$1);
      this.A.c();
   }

   protected void a(long $$0) {
   }

   private adu bi() {
      adu.b $$0 = this.bj();
      return new adu(tf.a(this.Y), Optional.of($$0), Optional.of(adu.c.a()), Optional.ofNullable(this.J), this.aw());
   }

   private adu.b bj() {
      List<akl> $$0 = this.Q.t();
      int $$1 = this.I();
      if (this.aj()) {
         return new adu.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = arp.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            akl $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.X() ? $$6.fP() : g);
         }

         ac.b($$3, this.K);
         return new adu.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ac().t().forEach($$0x -> $$0x.c.g());
      this.A.a("commandFunctions");
      this.aA().c();
      this.A.b("levels");

      for (akk $$1 : this.F()) {
         this.A.a(() -> $$1 + " " + $$1.ac().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.ad().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aS) {
         px.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.b("send chunks");

      for (akl $$5 : this.Q.t()) {
         $$5.c.f.a($$5);
         $$5.c.h();
      }

      this.A.c();
   }

   private void b(akk $$0) {
      this.Q.a(new aad($$0.V(), $$0.W(), $$0.X().b(cph.k)), $$0.ac());
   }

   public void A() {
      this.A.a("timeSync");

      for (akk $$0 : this.F()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean B() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.as = $$0;
   }

   public boolean C() {
      return !this.ag.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final akk D() {
      return this.P.get(cpl.h);
   }

   @Nullable
   public akk a(aeq<cpl> $$0) {
      return this.P.get($$0);
   }

   public Set<aeq<cpl>> E() {
      return this.P.keySet();
   }

   public Iterable<akk> F() {
      return this.P.values();
   }

   @Override
   public String G() {
      return aa.b().c();
   }

   @Override
   public int H() {
      return this.Q.m();
   }

   @Override
   public int I() {
      return this.Q.n();
   }

   public String[] J() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Data Packs", () -> this.ak.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> cdw.d.b(this.m.M()).stream().map(aer::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.m.D().toString());
      if (this.as != null) {
         $$0.a("Server Id", () -> this.as);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public aro K() {
      return aro.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(tf $$0) {
      n.info($$0.getString());
   }

   public KeyPair L() {
      return this.aa;
   }

   public int M() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile N() {
      return this.ab;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ab = $$0;
   }

   public boolean O() {
      return this.ab != null;
   }

   protected void P() {
      n.info("Generating keypair");

      try {
         this.aa = aqp.b();
      } catch (aqq var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bgn $$0, boolean $$1) {
      if ($$1 || !this.m.t()) {
         this.m.a(this.m.n() ? bgn.d : $$0);
         this.bs();
         this.ac().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bs() {
      for (akk $$0 : this.F()) {
         $$0.b(this.Q(), this.W());
      }
   }

   public void b(boolean $$0) {
      this.m.d($$0);
      this.ac().t().forEach(this::c);
   }

   private void c(akl $$0) {
      ebt $$1 = $$0.dK().u_();
      $$0.c.b(new xc($$1.s(), $$1.t()));
   }

   public boolean Q() {
      return this.m.s() != bgn.a;
   }

   public boolean R() {
      return this.ac;
   }

   public void c(boolean $$0) {
      this.ac = $$0;
   }

   public Optional<MinecraftServer.b> S() {
      return Optional.empty();
   }

   public boolean T() {
      return this.S().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean U() {
      return this.U;
   }

   public void d(boolean $$0) {
      this.U = $$0;
   }

   public boolean V() {
      return this.V;
   }

   public void e(boolean $$0) {
      this.V = $$0;
   }

   public boolean W() {
      return true;
   }

   public boolean X() {
      return true;
   }

   public abstract boolean n();

   public boolean Y() {
      return this.W;
   }

   public void f(boolean $$0) {
      this.W = $$0;
   }

   public boolean Z() {
      return this.X;
   }

   public void g(boolean $$0) {
      this.X = $$0;
   }

   public abstract boolean o();

   @Override
   public String aa() {
      return this.Y;
   }

   public void d(String $$0) {
      this.Y = $$0;
   }

   public boolean ab() {
      return this.S;
   }

   public anz ac() {
      return this.Q;
   }

   public void a(anz $$0) {
      this.Q = $$0;
   }

   public abstract boolean p();

   public void a(cpi $$0) {
      this.m.a($$0);
   }

   public alh ad() {
      return this.G;
   }

   public boolean ae() {
      return this.ad;
   }

   public boolean af() {
      return false;
   }

   public boolean a(@Nullable cpi $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ag() {
      return this.T;
   }

   public int ah() {
      return 16;
   }

   public boolean a(akk $$0, gu $$1, cbm $$2) {
      return false;
   }

   public boolean ai() {
      return true;
   }

   public boolean aj() {
      return false;
   }

   public Proxy ak() {
      return this.j;
   }

   public int al() {
      return this.Z;
   }

   public void c(int $$0) {
      this.Z = $$0;
   }

   public MinecraftSessionService am() {
      return this.l.b();
   }

   @Nullable
   public arz an() {
      return this.l.a();
   }

   public GameProfileRepository ao() {
      return this.l.d();
   }

   @Nullable
   public anv ap() {
      return this.l.e();
   }

   @Nullable
   public adu aq() {
      return this.I;
   }

   public void ar() {
      this.af = 0L;
   }

   public int as() {
      return 29999984;
   }

   @Override
   public boolean at() {
      return super.at() && !this.ab();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ab()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread au() {
      return this.ag;
   }

   public int av() {
      return 256;
   }

   public boolean aw() {
      return false;
   }

   public long ax() {
      return this.ah;
   }

   public DataFixer ay() {
      return this.L;
   }

   public int a(@Nullable akk $$0) {
      return $$0 != null ? $$0.X().c(cph.r) : 10;
   }

   public afd az() {
      return this.at.b.e();
   }

   public aff aA() {
      return this.ao;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      hs.b $$1 = this.O.b(afa.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ak::c).filter(Objects::nonNull).map(amu::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            anc $$2x = new anf(amb.b, $$1x);
            return afb.a($$2x, $$1, this.m.M(), this.l() ? ds.a.b : ds.a.c, this.j(), this.ar, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.at.close();
            this.at = $$1x;
            this.ak.a($$0);
            cqe $$2x = new cqe(a(this.ak), this.m.M());
            this.m.a($$2x);
            this.at.b.a(this.aU());
            this.ac().h();
            this.ac().u();
            this.ao.a(this.at.b.a());
            this.au.a(this.at.a);
         }, this);
      if (this.bl()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cqe a(amx $$0, coz $$1, boolean $$2, cdu $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cqe.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               n.warn("Missing data pack {}", $$5);
            }
         }

         for (amu $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               cdu $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     n.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     n.info("Found new data pack {}, but can't load it due to missing features {}", $$7, cdw.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  n.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, cdw.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            n.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         coz $$10 = a($$0);
         cdu $$11 = $$0.e();
         return new cqe($$10, $$11);
      }
   }

   private static coz a(amx $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new coz($$2, $$3);
   }

   public void a(dr $$0) {
      if (this.aK()) {
         anz $$1 = $$0.l().ac();
         aoh $$2 = $$1.i();

         for (akl $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fP())) {
               $$4.c.b(tf.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public amx aB() {
      return this.ak;
   }

   public ds aC() {
      return this.at.b.d();
   }

   public dr aD() {
      akk $$0 = this.D();
      return new dr(this, $$0 == null ? ehd.b : ehd.a($$0.R()), ehc.a, $$0, 4, "Server", tf.b("Server"), this, null);
   }

   @Override
   public boolean f_() {
      return true;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public abstract boolean N_();

   public cmb aE() {
      return this.at.b.c();
   }

   public afi aF() {
      return this.al;
   }

   public ebp aG() {
      if (this.am == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.am;
      }
   }

   public ecj aH() {
      return this.at.b.b();
   }

   public cph aI() {
      return this.D().X();
   }

   public afq aJ() {
      return this.an;
   }

   public boolean aK() {
      return this.ap;
   }

   public void h(boolean $$0) {
      this.ap = $$0;
   }

   public float aL() {
      return this.aq;
   }

   public int c(GameProfile $$0) {
      if (this.ac().g($$0)) {
         aob $$1 = this.ac().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.O()) {
            return this.ac().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public bdh aM() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<aeq<cpl>, akk> $$2 : this.P.entrySet()) {
            aer $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         n.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bm()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aL()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.k)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final cph $$3 = this.aI();
         cph.a(new cph.c() {
            @Override
            public <T extends cph.g<T>> void a(cph.e<T> $$0, cph.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<arq.a> $$2;
         try {
            $$2 = Lists.newArrayList(arq.a());
         } catch (Throwable var7) {
            n.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (arq.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bt() {
      if (this.D) {
         this.z = beq.a(new beu(ac.b, this.l()), ac.b, ac.g(), new bew("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bdk.a(this.z.f(), bdk.a("Server"));
      this.z.c();
      this.A.a();
   }

   private void bu() {
      this.A.b();
      this.z.d();
   }

   public boolean aN() {
      return this.z.e();
   }

   public void a(Consumer<bdg> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aO();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aO() {
      this.z = ber.a;
   }

   public void aP() {
      this.z.a();
   }

   public void aQ() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(ebu $$0) {
      return this.h.a($$0);
   }

   public boolean aR() {
      return true;
   }

   public dys aS() {
      return this.au;
   }

   public ecc aT() {
      return this.m;
   }

   public hs.b aU() {
      return this.O.a();
   }

   public hl<afa> aV() {
      return this.O;
   }

   public aln a(akl $$0) {
      return aln.a;
   }

   public akm b(akl $$0) {
      return (akm)(this.R() ? new akb($$0) : new akm($$0));
   }

   @Nullable
   public cpi aW() {
      return null;
   }

   public anm aX() {
      return this.at.a;
   }

   public boolean aY() {
      return this.av;
   }

   public boolean aZ() {
      return this.F || this.E != null;
   }

   public void ba() {
      this.F = true;
   }

   public bdg bb() {
      if (this.E == null) {
         return bdc.a;
      } else {
         bdg $$0 = this.E.a(ac.c(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bc() {
      return 1000000;
   }

   public void a(tf $$0, tb.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         n.info("[{}] {}", $$2, $$3);
      } else {
         n.info("{}", $$3);
      }
   }

   public ta bd() {
      return ta.a;
   }

   public boolean be() {
      return true;
   }

   static record a(anc a, afb b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable tf d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bdg a(final long $$0, final int $$1) {
         return new bdg() {
            @Override
            public List<bdj> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
