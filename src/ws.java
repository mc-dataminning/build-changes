import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ws(wt l, wt m) {
   public static final Codec<ws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wt.a.fieldOf("chat").forGetter(ws::a), wt.a.fieldOf("narration").forGetter(ws::b)).apply($$0, ws::new)
   );
   public static final yu<wh, ws> b = yu.a(wt.b, ws::a, wt.b, ws::b, ws::new);
   public static final yu<wh, je<ws>> c = ys.a(mg.aI, b);
   public static final wt d = wt.a("chat.type.text");
   public static final ald<ws> e = a("chat");
   public static final ald<ws> f = a("say_command");
   public static final ald<ws> g = a("msg_command_incoming");
   public static final ald<ws> h = a("msg_command_outgoing");
   public static final ald<ws> i = a("team_msg_command_incoming");
   public static final ald<ws> j = a("team_msg_command_outgoing");
   public static final ald<ws> k = a("emote_command");

   private static ald<ws> a(String $$0) {
      return ald.a(mg.aI, ale.b($$0));
   }

   public static void a(qh<ws> $$0) {
      $$0.a(e, new ws(d, wt.a("chat.type.text.narrate")));
      $$0.a(f, new ws(wt.a("chat.type.announcement"), wt.a("chat.type.text.narrate")));
      $$0.a(g, new ws(wt.b("commands.message.display.incoming"), wt.a("chat.type.text.narrate")));
      $$0.a(h, new ws(wt.c("commands.message.display.outgoing"), wt.a("chat.type.text.narrate")));
      $$0.a(i, new ws(wt.d("chat.type.team.text"), wt.a("chat.type.text.narrate")));
      $$0.a(j, new ws(wt.d("chat.type.team.sent"), wt.a("chat.type.text.narrate")));
      $$0.a(k, new ws(wt.a("chat.type.emote"), wt.a("chat.type.emote")));
   }

   public static ws.a a(ald<ws> $$0, bwa $$1) {
      return a($$0, $$1.dV().F_(), $$1.m_());
   }

   public static ws.a a(ald<ws> $$0, ei $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static ws.a a(ald<ws> $$0, js $$1, ww $$2) {
      jr<ws> $$3 = $$1.f(mg.aI);
      return new ws.a($$3.b($$0), $$2);
   }

   public wt a() {
      return this.l;
   }

   public wt b() {
      return this.m;
   }

   public static record a(je<ws> b, ww c, Optional<ww> d) {
      public static final yu<wh, ws.a> a = yu.a(ws.c, ws.a::a, wy.d, ws.a::b, wy.e, ws.a::c, ws.a::new);

      a(je<ws> $$0, ww $$1) {
         this($$0, $$1, Optional.empty());
      }

      public ww a(ww $$0) {
         return this.b.a().a().a($$0, this);
      }

      public ww b(ww $$0) {
         return this.b.a().b().a($$0, this);
      }

      public ws.a c(ww $$0) {
         return new ws.a(this.b, this.c, Optional.of($$0));
      }

      public je<ws> a() {
         return this.b;
      }

      public ww b() {
         return this.c;
      }

      public Optional<ww> c() {
         return this.d;
      }
   }
}
