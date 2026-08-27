import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record we(wf j, wf k) {
   public static final Codec<we> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wf.a.fieldOf("chat").forGetter(we::a), wf.a.fieldOf("narration").forGetter(we::b)).apply($$0, we::new)
   );
   public static final wf b = wf.a("chat.type.text");
   public static final aju<we> c = a("chat");
   public static final aju<we> d = a("say_command");
   public static final aju<we> e = a("msg_command_incoming");
   public static final aju<we> f = a("msg_command_outgoing");
   public static final aju<we> g = a("team_msg_command_incoming");
   public static final aju<we> h = a("team_msg_command_outgoing");
   public static final aju<we> i = a("emote_command");

   private static aju<we> a(String $$0) {
      return aju.a(ku.ax, new ajv($$0));
   }

   public static void a(pz<we> $$0) {
      $$0.a(c, new we(b, wf.a("chat.type.text.narrate")));
      $$0.a(d, new we(wf.a("chat.type.announcement"), wf.a("chat.type.text.narrate")));
      $$0.a(e, new we(wf.b("commands.message.display.incoming"), wf.a("chat.type.text.narrate")));
      $$0.a(f, new we(wf.c("commands.message.display.outgoing"), wf.a("chat.type.text.narrate")));
      $$0.a(g, new we(wf.d("chat.type.team.text"), wf.a("chat.type.text.narrate")));
      $$0.a(h, new we(wf.d("chat.type.team.sent"), wf.a("chat.type.text.narrate")));
      $$0.a(i, new we(wf.a("chat.type.emote"), wf.a("chat.type.emote")));
   }

   public static we.a a(aju<we> $$0, bqa $$1) {
      return a($$0, $$1.dM().H_(), $$1.O_());
   }

   public static we.a a(aju<we> $$0, dv $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static we.a a(aju<we> $$0, jb $$1, wi $$2) {
      ja<we> $$3 = $$1.d(ku.ax);
      return new we.a($$3.g($$0), $$2);
   }

   public wf a() {
      return this.j;
   }

   public wf b() {
      return this.k;
   }

   public static record a(in<we> b, wi c, Optional<wi> d) {
      public static final yg<vt, we.a> a = yg.a(ye.b(ku.ax), we.a::a, wk.d, we.a::b, wk.e, we.a::c, we.a::new);

      a(in<we> $$0, wi $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wi a(wi $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wi b(wi $$0) {
         return this.b.a().b().a($$0, this);
      }

      public we.a c(wi $$0) {
         return new we.a(this.b, this.c, Optional.of($$0));
      }

      public in<we> a() {
         return this.b;
      }

      public wi b() {
         return this.c;
      }

      public Optional<wi> c() {
         return this.d;
      }
   }
}
